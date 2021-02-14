import java.util.Arrays;

public class Q268_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int totalSum = 0, i = 0;
        while (i < nums.length) {
           totalSum += nums[i++];
        }
        return expectedSum - totalSum;
    }
}
