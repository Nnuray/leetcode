package contest;

import java.util.Arrays;
import java.util.Scanner;

public class С {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        int n = scanner.nextInt();
        long[] p = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextLong();
        }

        Arrays.sort(p);

        long left = 0;
        long right = L;

        while (left < right) {
            long mid = (left + right) / 2;
            boolean canBurnAll = true;

            long prevPosition = 0;
            for (int i = 0; i < n; i++) {
                long diff = p[i] - prevPosition;
                long spread = mid / 2;

                if (diff > spread) {
                    canBurnAll = false;
                    break;
                }

                long leftSpread = Math.min(spread, diff);
                long rightSpread = Math.min(spread, diff);

                prevPosition = p[i] + rightSpread;
            }

            if (canBurnAll) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}