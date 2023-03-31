package current;

public class Q1967_Number_Of_Strings_That_Appear_As_Substrings_In_Word {
    public int numOfStrings(String[] patterns, String word) {
        int total = 0;
        for (int i=0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                total++;
            }
        }
        return total;
    }
}
