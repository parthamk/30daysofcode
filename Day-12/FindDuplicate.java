public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int duplicateNumber = findDuplicateNumber(arr);
        System.out.println("The duplicate number is: " + duplicateNumber);
    }

    public static int findDuplicateNumber(int[] nums) {
        // Floyd's Tortoise and Hare (Cycle Detection) algorithm
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
