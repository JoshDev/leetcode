package old;

import java.util.*;

public class MaxKInList {
    public List<Integer> maxNFromList(int[] list, int k) {
        Queue<Integer> qq = new PriorityQueue<>(Comparator.naturalOrder());
        for (int i = 0; i < list.length; i++) {
            if (qq.size() == k) {
                if (list[i] > qq.peek()) {
                    qq.remove();
                    qq.add(list[i]);
                }
            } else {
                qq.add(list[i]);
            }
        }
        return new ArrayList<>(qq);
    }

    public static void main(String[] args) {
        System.out.println(new MaxKInList().maxNFromList(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
