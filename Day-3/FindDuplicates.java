import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arrayA = {0, 1, 2, 3, 2, 3};
        Set<Integer> set = new HashSet<>();
        boolean foundDuplicate = false;

        for (int num : arrayA) {
            if (!set.add(num)) {
                System.out.println("Duplicate number is: " + num);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates.");
        }
    }
}
