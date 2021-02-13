public class Q53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0, currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int test = currSum + nums[i];
            currSum = test > nums[i] ? test : nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
