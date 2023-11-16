package contest2;

import java.util.Arrays;
import java.util.Scanner;

public class FactoryMachines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int left = 0;
        int right = n*t;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int totalProducts = 0;

            for (int i = 0; i < n; i++) {
                totalProducts += mid / array[i];
            }

            if (totalProducts >= t) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}
