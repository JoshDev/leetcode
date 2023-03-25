package old;

import java.util.ArrayList;
import java.util.List;

public class Q1389_CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> finalArr = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            finalArr.add(index[i], nums[i]);
        }
        int[] convertedArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            convertedArr[i] = finalArr.get(i);
        }
        return convertedArr;
    }
}
