package contest2;

import java.util.Scanner;

public class StickLengths {
    public int MaxTotalCost(int n, int [] array) {
        int opCount = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == average) {
                int dif = 0;
            } else if (array[i] < average) {
                int dif = average - array[i];
                opCount = opCount + dif;
            } else {
                int dif = array[i] - average;
                opCount = opCount + dif;
            }
            return opCount;
        }
        return opCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        StickLengths solution = new StickLengths();
        int result = solution.MaxTotalCost(n,array);
        System.out.println(result);
    }
}
