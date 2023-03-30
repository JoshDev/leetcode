package current;

public class Q696_Count_Binary_Substrings {
    public int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, total = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                total += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        return total + Math.min(curr, prev);
    }
}
