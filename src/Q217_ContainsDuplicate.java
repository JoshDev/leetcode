import java.util.HashSet;
import java.util.Set;

public class Q217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ss =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int test = nums[i];
            if (ss.contains(test)) {
                return true;
            }
            ss.add(test);
        }
        return false;
    }
}
