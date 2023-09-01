public class EqualArrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 4, 0};
        int[] B = {1, 2, 5, 4, 0};

        boolean result = areArraysEqual(A, B);

        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
