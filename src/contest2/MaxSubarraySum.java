package contest2;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.println(i + " iteration " + currentSum + " is a current sum");

            maxSum = Math.max(maxSum, currentSum);
             System.out.println(i +" iteration "+ maxSum + " is maxSum");
        }
        System.out.println(maxSum);

    }
}
