import java.util.Scanner;

public class EvenOddSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many array item:");
        int size = sc.nextInt();
        
        int[] originalArray = new int[size];
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = sc.nextInt();
            

            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount] = originalArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            }
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
