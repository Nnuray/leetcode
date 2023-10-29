package contest2;

import java.util.Scanner;

public class MaxSubArrSum {
    public int MaxSubArrSum(int n, int[] arr){
        int curSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<n; i++){
            curSum= Math.max(arr[i],curSum+arr[i]);
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        MaxSubArrSum solution = new MaxSubArrSum();
        int rest = solution.MaxSubArrSum(n, arr);
        System.out.println(rest);
    }
}
