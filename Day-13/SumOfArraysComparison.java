import java.util.*;

public class SumOfArraysComparison {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        System.out.println("Sum of array1: " + sum1);
        System.out.println("Sum of array2: " + sum2);

        if (sum1 == sum2) {
            System.out.println("The sums arrays are equal.");
        } else if (sum1 > sum2) {
            System.out.println("Array1 has the bigger sum: " + Arrays.toString(array1));
        } else {
            System.out.println("Array2 has the bigger sum: " + Arrays.toString(array2));
        }
    }

    // Helper method to calculate the sum of an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
