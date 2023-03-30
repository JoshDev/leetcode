package current;

public class Q1332_Remove_Palindromic_Subsequences {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s)) return 1;
        return 2;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.toCharArray().length/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
