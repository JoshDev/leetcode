public class Q1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] retArr = new int[nums.length];
        int i=0, j=0;
        while (i<nums.length) {
            retArr[i]=nums[j];
            retArr[i+1]=nums[j+n];
            i=i+2;
            j++;
        }
        return retArr;
    }
}
