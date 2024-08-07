public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Finding the intersection point of the two runners.
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Finding the entrance to the cycle.
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 3};
        int duplicate = findDuplicate(arr);
        System.out.println("The duplicate value is: " + duplicate);
    }
}
