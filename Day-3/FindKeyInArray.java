public class FindKeyInArray {
    public static void main(String[] args) {
        int[] arrayA = {0, 1, 2, 3, 4, 5};
        int key = 8;
        boolean found = false;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == key) {
                System.out.println("Key " + key + " found at index " + i);
                found = true;
                break;  
            }
        }

        if (!found) {
            System.out.println("Key " + key + " not found in array.");
        }
    }
}
