import java.util.HashSet;
import java.util.Set;

public class Q1684_CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            chars.add(c);
        }
        int totalConsistent = 0;
        for (String word : words) {
            boolean consistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!chars.contains(word.charAt(i))) {
                    consistent = false;
                    break;
                }
            }
            totalConsistent += consistent ? 1 : 0;
        }
        return totalConsistent;
    }
}
