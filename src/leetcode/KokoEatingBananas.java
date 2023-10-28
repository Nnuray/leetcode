package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] pile, int h) {
        int n = pile.length;
        int k = 1;
        List<Integer> piles = new ArrayList<Integer>();

        if (n == h) {
            int max = piles.get(0);
            for (int i = 1; i < n; i++) {
                if (piles.get(i) > max) {
                    max = piles.get(i);
                }
            }
            k = max;
        }
        while (n < h) {
            int rest = h-n;
            return k;
        }
        return n;
    }
}
//Input: piles = [3,6,7,11], h = 8
//Output: 4