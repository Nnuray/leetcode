package contest;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int energy = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                if (i > 0 && a[i-1] > 0) {
                    a[i]++;
                    a[i-1]--;
                    energy++;
                } else if (i < n-1 && a[i+1] > 0) {
                    a[i]++;
                    a[i+1]--;
                    energy++;
                } else {
                    a[i]++;
                    energy++;
                }
            }
            a[i]--;
        }
        System.out.println(energy);
    }
}
