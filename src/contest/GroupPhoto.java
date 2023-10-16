package contest;

import java.util.Arrays;
import java.util.Scanner;

public class GroupPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int operation = 0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        boolean areEqual = Arrays.equals(a, b);
        for (int i = 0; i < n; i++) {
            if(a[i] != b[i]){
                areEqual = false;
                operation++;
            }
        }
        System.out.println(operation);
    }
}
