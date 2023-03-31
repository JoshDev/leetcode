package current;

import java.util.HashSet;
import java.util.Set;

public class Q1763_Longest_Nice_Substring {
    public String longestNiceSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            seen.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((Character.isLowerCase(c) && !seen.contains(Character.toUpperCase(c))) ||
                    (Character.isUpperCase(c) && !seen.contains(Character.toLowerCase(c)))) {
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                if (left.length() >= right.length()) {
                    return left;
                } else {
                    return right;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
