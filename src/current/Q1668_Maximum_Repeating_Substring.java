package current;

public class Q1668_Maximum_Repeating_Substring {
    public int maxRepeating(String sequence, String word) {
        String test = word;
        int count = 0;
        while (test.length() <= sequence.length()) {
            if (sequence.contains(test)) {
                count++;
                test += word;
            } else {
                break;
            }
        }
        return count;
    }
}
