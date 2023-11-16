package contest2;

import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int tower = 1;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] < array[i + 1]) {
                tower++;
            }
        }
        System.out.println(tower);
    }
}
