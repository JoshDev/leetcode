public class Q303_RangeSumQueryImmutable {
    int[] sumArray;
    public Q303_RangeSumQueryImmutable(int[] nums) {
        this.sumArray = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sumArray[i + 1] = sumArray[i] + nums[i];
        }
    }
    public int sumRange(int i, int j) {
        return sumArray[j + 1] - sumArray[i];
    }
}
