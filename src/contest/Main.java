package contest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n]; // given array
        int[] p = new int[n + 1]; // positions array
        boolean[] used = new boolean[n]; // used elements array
        int[] b = new int[n]; // final array

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // read given array
            p[a[i]] = i; // save positions of elements
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt(); // read final array
        }

        int ptr = 0; // unordered suffix start
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (used[ptr]) {
                // skip used elements
                ptr++;
                // It won't make complexity worse because ptr only grows and won't exceed n
                // so it can increment only n times for all iterations of the outer cycle
            }

            if (a[ptr] == b[i]) {
                // if element is already in the correct position and we don't need to move it
                ptr++;
                continue;
            }

            used[p[b[i]]] = true;
            // claim the needed element as used, b[i] - the element we need, p[b[i]] - position of element b[i] in array a[]
            ans++;
            // and increment the answer
        }

        System.out.println(ans);
    }
}
