package old;

public class Q1720_DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] resArray = new int[encoded.length + 1];
        resArray[0] = first;
        for (int i = 1; i < resArray.length; i++) {
            resArray[i] = encoded[i - 1] ^ resArray[i - 1];
        }
        return resArray;
    }
}
