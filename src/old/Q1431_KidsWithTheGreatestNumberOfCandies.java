package old;

import java.util.*;

public class Q1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> retList = new ArrayList<Boolean>();
        int i = 0, j = candies.length - 1;
        int max = -1;
        while (i < j) {
            if (candies[i] > candies[j]) {
                max = candies[i];
                j--;
            } else {
                max = candies[j];
                i++;
            }
        }
        for (int candy : candies) {
            if (extraCandies + candy >= max) {
                retList.add(Boolean.TRUE);
            } else {
                retList.add(Boolean.FALSE);
            }
        }
        return max == -1 ? Collections.emptyList() : retList;
    }
}
