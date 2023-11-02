package contest2;

import java.util.Arrays;
import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int x = 0;
        int [] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i]=sc.nextInt();
        }
        int [] room = new int[m];
        for (int i = 0; i < m; i++) {
            room[i] = sc.nextInt();
        }

        Arrays.sort(people);
        Arrays.sort(room);
        int leftP = 0;
        int leftR = 0;
        while (leftP<n && leftR<m){
                int dif = Math.abs(people[leftP]-room[leftR]);
                if(dif<=k){
                    x++;
                    leftP++;
                    leftR++;
                } else if(people[leftP]<room[leftR]){
                    leftP++;
                } else leftR++;
        }
        System.out.println(x);

    }
}
