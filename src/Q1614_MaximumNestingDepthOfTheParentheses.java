public class Q1614_MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0, currentDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                currentDepth++;
            } else if (s.charAt(i) == ')') {
                currentDepth--;
            }
            maxDepth = Math.max(maxDepth, currentDepth);
        }
        return maxDepth;
    }
}
