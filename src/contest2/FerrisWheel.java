package contest2;

import java.util.*;

public class FerrisWheel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        Arrays.sort(weights);

        int left = 0;
        int right = n - 1;
        int gondolaCount = 0;

        while (left <= right) {
            if (weights[left] + weights[right] <= x) {
                left++;
            }
            right--;
            gondolaCount++;
        }

        System.out.println(gondolaCount);
    }
}
