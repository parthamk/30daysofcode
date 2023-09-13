import java.util.*;

public class MiddleElementAfterMerge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 4, 0};
        int[] array2 = {1, 2, 3, 4, 5};
        
        int[] mergedArray = mergeArrays(array1, array2);
        
        int[] middleElements = findMiddleElements(mergedArray);
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        
        if (middleElements.length == 1) {
            System.out.println("Middle Element: " + middleElements[0]);
        } else {
            System.out.println("Middle Elements: " + Arrays.toString(middleElements));
        }
    }
    
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        
        return merged;
    }
    
    public static int[] findMiddleElements(int[] arr) {
        int length = arr.length;
        
        if (length % 2 == 0) {
            // Even number of elements, return both middle elements
            int middle1 = arr[length / 2 - 1];
            int middle2 = arr[length / 2];
            return new int[]{middle1, middle2};
        } else {
            // Odd number of elements, return the single middle element
            int middle = arr[length / 2];
            return new int[]{middle};
        }
    }
}

