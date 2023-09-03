public class EqualArray {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 5, 4, 0};
        int[] B1 = {1, 2, 5, 4, 0};
        boolean areEqual1 = areArraysEqual(A1, B1);

        System.out.println("Testcase 1:");
        if (areEqual1) {
            System.out.println("Arrays A1 and B1 are equal.");
        } else {
            System.out.println("Arrays A1 and B1 are not equal.");
        }

        int[] A2 = {1, 2, 3, 4, 5};
        int[] B2 = {11, 22, 33, 44};
        boolean areEqual2 = areArraysEqual(A2, B2);

        System.out.println("Testcase 2:");
        if (areEqual2) {
            System.out.println("Arrays A2 and B2 are equal.");
        } else {
            System.out.println("Arrays A2 and B2 are not equal.");
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
