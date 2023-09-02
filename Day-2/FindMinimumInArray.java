public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5};

        int min = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }

        System.out.println("Minimum value: " + min);
    }
}