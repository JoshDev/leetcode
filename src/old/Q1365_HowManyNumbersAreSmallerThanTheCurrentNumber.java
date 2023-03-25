package old;

import java.util.*;

public class Q1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxVal = nums[0];
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
            maxVal = Math.max(maxVal, i);
        }
        int[] testArr = new int[maxVal + 1];
        testArr[0] = 0;
        for (int i = 1; i <= maxVal; i++) {
            testArr[i] = freq.getOrDefault(i - 1, 0) + testArr[i - 1];
        }
        int[] retArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            retArr[i] = testArr[nums[i]];
        }
        return retArr;
    }
}
