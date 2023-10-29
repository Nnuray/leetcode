package contest2;

import java.util.Scanner;

public class StickLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int opCount = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        //System.out.println(average);
        average = average / array.length;
        //System.out.println(average);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == average) {
                opCount +=0;
            } else if (array[i] < average || array[i]>average) {
                int dif = Math.abs(average - array[i]);
                opCount = opCount + dif;
            }
        }
        System.out.println(opCount);
    }
}
