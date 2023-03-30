package current;

public class Q26_Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                unique+=1;
            } else if (nums[i] != nums[i-1]){
                nums[unique] = nums[i];
                unique+=1;
            }
        }
        return unique;
    }
}
