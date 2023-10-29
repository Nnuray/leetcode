package contest2;

import java.util.Arrays;
import java.util.Scanner;

public class FerrisW {
    public int Ferris(int n, int x, int[] weights){
        int gondola=0;
        int left = 0;
        int rights = n-1;
        Arrays.sort(weights);
        while(left<=rights){
            if(weights[left]+weights[rights]<=x){
                left++;
            }
            rights--;
            gondola++;
        }
        return gondola;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        FerrisW solution = new FerrisW();
        int result = solution.Ferris(n,x,weights);
        System.out.println(result);
    }
}
