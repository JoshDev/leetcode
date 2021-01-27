import java.util.ArrayList;
import java.util.List;

public class Q1313_DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> retArrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int value = nums[i+1];
            for (int j = 0; j < freq; j++) {
                retArrayList.add(value);
            }
        }
        int[] retArray = new int[retArrayList.size()];
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = retArrayList.get(i);
        }
        return retArray;
    }
}
