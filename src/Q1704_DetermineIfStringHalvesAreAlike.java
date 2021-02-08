import java.util.Set;

public class Q1704_DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> ss = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int i = 0, j = s.length() - 1, leftCount = 0, rightCount = 0;
        while (i < j) {
            if (ss.contains(s.charAt(i))) leftCount++;
            if (ss.contains(s.charAt(j))) rightCount++;
            i++; j--;
        }
        return leftCount == rightCount;
    }
}
