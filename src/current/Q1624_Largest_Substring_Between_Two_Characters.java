package current;

import java.util.HashMap;
import java.util.Map;

public class Q1624_Largest_Substring_Between_Two_Characters {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!seen.containsKey(s.charAt(i))) {
                seen.put(s.charAt(i), i);
            }
        }
        int max = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (seen.containsKey(s.charAt(i))) {
                int ind = seen.get(s.charAt(i));
                if (i - ind > 0) {
                    max = Math.max(max, (i - ind - 1));
                }
            }
        }
        return max;
    }
}
