import java.util.HashSet;
import java.util.Set;

public class Q771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (Character c : jewels.toCharArray()) {
            jewelSet.add(c);
        }
        int total = 0;
        for (Character s : stones.toCharArray()) {
            total += jewelSet.contains(s) ? 1 : 0;
        }
        return total;
    }
}
