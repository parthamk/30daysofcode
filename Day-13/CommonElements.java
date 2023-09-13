import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        Set<Integer> commonElements = new HashSet<>();

        for (int element : array1) {
            if (contains(array2, element)) {
                commonElements.add(element);
            }
        }

        System.out.println(commonElements);
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
