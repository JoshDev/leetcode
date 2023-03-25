package old;

public class Q1221_SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int rCount = 0, lCount = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'R':
                    rCount++;
                    if (rCount == lCount) {
                        balancedCount++;
                        rCount = 0;
                        lCount = 0;
                    }
                    break;
                case 'L':
                    lCount++;
                    if (lCount == rCount) {
                        balancedCount++;
                        rCount = 0;
                        lCount = 0;
                    }
                    break;
            }
        }
        return balancedCount;
    }
}
