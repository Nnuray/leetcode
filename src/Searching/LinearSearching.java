package Searching;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean found = false;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0; i<n; i++) {
            if (arr[i] == target) {
                System.out.println("Элемент " + target + " найден по индексу " + i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Элемент "+target+" не найден");
            }
        }
    }