package lecture;

import java.util.Scanner;

public class task1 {
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
        if (index == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    static void printCombinations(int arr[], int n, int r) {
        int data[] = new int[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        printCombinations(arr, n, r);
    }
}
