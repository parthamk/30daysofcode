import java.util.*;

public class CommonElement {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5};
        int[] B = {5, 4, 3, 2, 1, 0};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int num : A) {
            setA.add(num);
        }

        for (int num : B) {
            setB.add(num);
        }

        setA.retainAll(setB);

        Integer[] commonElementsArray = setA.toArray(new Integer[0]);

        System.out.println("Common Elements:");

        for (int num : commonElementsArray) {
            System.out.print(num + ",");
        }
    }
}
