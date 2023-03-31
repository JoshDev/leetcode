package current;

import java.util.HashSet;
import java.util.Set;

public class Q2062_Count_Vowel_Substrings_Of_A_String {
    public int countVowelSubstrings(String word) {
        int total = 0;
        for (int i = 0; i < word.length() - 4; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < word.length(); j++) {
                if (isVowel(word.charAt(j))) {
                    seen.add(word.charAt(j));
                } else {
                    break;
                }
                if (seen.size() == 5) {
                    total++;
                }
            }
        }
        return total;
    }

    private boolean isVowel(char charAt) {
        return charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' | charAt == 'u';
    }
}
