package old;

public class Q344_ReverseString {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char swap = s[i];
            s[i] = s[j];
            s[j] = swap;
            i++;
            j--;
         }
    }
}
