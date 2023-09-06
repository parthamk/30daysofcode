public class OneFrequency {
    public static void main(String[] args) {
        int[] A1 = {1, 1, 3, 3, 3, 0};
        int[] A2 = {1, 2, 2, 2, 2, 2, 2};

        int singleFrequency1 = singleFrequency(A1);
        int singleFrequency2 = singleFrequency(A2);

        System.out.println("Testcase 1: " + singleFrequency1);
        System.out.println("Testcase 2: " + singleFrequency2);
    }

    public static int singleFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Checking if the current element is not equal to its neighbors
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                return arr[i];
            }
        }
        return -1; // Return -1 if no such element is found
    }
}
