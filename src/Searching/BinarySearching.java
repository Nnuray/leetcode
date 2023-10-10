package Searching;

import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int left = 0;
        int right = arr.length-1;
        int res = -1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                res = mid;
                break;
            } else if(arr[mid]<target){
                left = mid+1;
            } else {
                right=mid-1;
            }
        }
        if(res != -1){
            System.out.println("Элемент "+ target+ " найден и индекс равен "+ res);
        }else {
            System.out.println("Элемент " + target + " не найден");
        }
    }
}
