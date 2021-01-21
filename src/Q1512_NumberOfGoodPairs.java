public class Q1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    total++;
                }
                j++;
            }
        }
        return total;
    }
}
