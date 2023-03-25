package old;

import java.util.*;

public class Q15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int lookFor = 0 - nums[j] - a;
                
                if (seen.size() > 0 && seen.contains(lookFor)) {
                    List<Integer> integers = Arrays.asList(a, nums[j], lookFor);
                    set.add(integers);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
