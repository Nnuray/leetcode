package contest;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumExcluded {
    public static int Mex(int n, int k, int x){
        int sum = 0;
        int array[] = new int[n];
        for (int i=0; i<n; i++){
            if (x==k){
                array[i] = k-1;
                k--;
            } else {
                array[i] = x;
                k--;
            }
            sum = IntStream.of(array).sum();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int a = Mex(n,k,x);
            System.out.println(a);
        }
    }
}
