package old;

public class Q1486_XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int total = start;
        for (int i = 1; i < n; i++) {
            total ^= (start + 2 * i);
        }
        return total;
    }
}
