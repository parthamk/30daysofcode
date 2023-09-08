import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        // Input the array elements
        int[] A = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array:");

        // Iterate through array to check for prime
        for (int num : A) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    //if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) { 
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
