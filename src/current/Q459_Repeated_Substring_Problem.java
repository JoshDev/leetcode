package current;

import java.util.HashMap;
import java.util.Map;

public class Q459_Repeated_Substring_Problem {
    public boolean repeatedSubstringPattern(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        int prev = -1;
        for (Integer value : countMap.values()) {
            if (prev != -1 && prev != value) {
                return false;
            }
            prev = value;
        }
        return s.length() > 1;
    }
}
