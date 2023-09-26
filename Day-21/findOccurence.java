public class findOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1};
        int n = arr.length;
        
        int x = -1; // Initialize the candidate element
        int count = 0;     // Initialize the count of the candidate element
        
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            
            if (count == 0) {
                x = current;
                count = 1;
            } else if (current == x) {
                count++;
            } else {
                count--;
            }
        }
        
        System.out.println(x);
    }
}
