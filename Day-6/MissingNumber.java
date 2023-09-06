import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 6, 4, 5};
        int[] B = {5, 4, 3, 2, 9, 0};

        Set<Integer> setB = new HashSet<>();

        for (int num : B) {
            setB.add(num);
        }

        List<Integer> missingNumbers = new ArrayList<>();

        for (int num : A) {
            if (!setB.contains(num)) {
                missingNumbers.add(num);
            }
        }

        System.out.println("Missing Numbers:");

        for (int num : missingNumbers) {
            System.out.print(num + " ");
        }
    }
}
