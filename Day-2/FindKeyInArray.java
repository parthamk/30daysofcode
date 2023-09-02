public class FindKeyInArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 4, 0};
        int k = 5;

        int index = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Key " + k + " found, index no: " + index);
        } else {
            System.out.println("Key " + k + " not found.");
        }
    }
}
