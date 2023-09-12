public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] arr = new int[100];
        // Initialize array with values 1 to 100
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        // Remove a number from the array to simulate a missing number
        arr[50] = 0;
        
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // The sum of numbers from 1 to 100 is calculated using the formula n*(n+1)/2
        int expectedSum = 100 * (100 + 1) / 2;
        
        return expectedSum - sum;
    }
}
