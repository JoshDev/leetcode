package current;

import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int lookFor = target - nums[i];
            if (seen.containsKey(lookFor)) {
                return new int[]{seen.get(lookFor), i};
            }
            seen.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
