public class arraySortChecker {
    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // If any element is greater than the next one, it's not sorted
                return false;
            }
        }

        // If we reach here, the array is sorted
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 5};
        int[] arr2 = {3, 4, 5, 6, 9};

        boolean isArr1Sorted = isSorted(arr1);
        boolean isArr2Sorted = isSorted(arr2);

        System.out.println("arr1 is sorted: " + isArr1Sorted); // false
        System.out.println("arr2 is sorted: " + isArr2Sorted); // true
    }
}
