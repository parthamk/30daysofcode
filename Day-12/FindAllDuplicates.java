import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println("The duplicate numbers are: " + duplicates);
    }

    public static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        return duplicates;
    }
}
