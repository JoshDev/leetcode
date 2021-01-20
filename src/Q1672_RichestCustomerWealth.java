import java.util.Arrays;

public class Q1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            max = Math.max(max, Arrays.stream(account).sum());
        }
        return max;
    }
}
