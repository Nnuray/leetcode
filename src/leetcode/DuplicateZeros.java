package leetcode;

import java.util.Scanner;

public class DuplicateZeros {
    // 1089. Duplicate Zeros
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        int lastIndex = n-1;
        int newIndex = n-1+zeros;
        for (; lastIndex >= 0; lastIndex--) {
            if (newIndex < n) {
                arr[newIndex] = arr[lastIndex];
            }
            if (newIndex < n) {
                arr[newIndex] = 0;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        DuplicateZeros solution = new DuplicateZeros();
        solution.duplicateZeros(arr);
        for(int i=0 ; i<length; i++){
            System.out.println(arr[i] +" ");
        }
    }
}
