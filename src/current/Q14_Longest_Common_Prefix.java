package current;

public class Q14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();
        for (String str : strs) {
            len = Math.min(len, str.length());
        }
        StringBuilder lcp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (currentChar != strs[j].charAt(i)) {
                    return lcp.toString();
                }
            }
            lcp.append(currentChar);
        }
        return lcp.toString();
    }
}
