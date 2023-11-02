package contest2;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcertTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tickets = new int[n];
        int[] customers = new int[m];
        ArrayList<Integer> rest = new ArrayList<>(m);
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            customers[i] = sc.nextInt();
        }

        int leftT = 0;
        int leftC = 0;
        while (leftT < n && leftC < m) {
            if (tickets[leftT] <= customers[leftC]) {
                rest.add(tickets[leftT]);
                leftT++;
                leftC++;
            } else {
                leftC++;
            }
        }
        while (leftC < m) {
            rest.add(-1);
            leftC++;
        }

        System.out.println(rest);
    }
}
//input
// 5 3
//5 3 7 8 5 tic
// 4 8 3 cus
//output
// 3 8 -1
