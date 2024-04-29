package zAttended;

//Using Recursive method

public class CanArraySplitEqualSum {
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false; // If total sum is odd, cannot be partitioned into equal sums
        }

        int target = totalSum / 2;
        return canPartitionDFS(nums, 0, target);
    }

    private static boolean canPartitionDFS(int[] nums, int index, int target) {
        if (target == 0) {
            return true;
        }
        if (index == nums.length || target < 0) {
            return false;
        }

        // Include the current element in the subset
        if (canPartitionDFS(nums, index + 1, target - nums[index])) {
            return true;
        }

        // Exclude the current element from the subset
        return canPartitionDFS(nums, index + 1, target);
    }

    public static void main(String[] args) {
        int[] a = { 1, 5, 11, 5 };
        System.out.println(canPartition(a)); // Output should be true
    }
}
