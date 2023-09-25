public class getAllSubarrays {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3};
      int n = arr.length;

      // Outer loop for subarray starting index
      for (int i = 0; i < n; i++) {
          // Inner loop for subarray ending index
          for (int j = i; j < n; j++) {
              // Print subarray from index i to j
              for (int k = i; k <= j; k++) {
                  System.out.print(arr[k] + " ");
              }
              System.out.println();
          }
      }
  }
}
