package contest;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n-1];
        for(int i=0; i<n-1; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int [] list = new int[n];
        for (int i=0; i<n; i++){
            list[i]=i+1;
        }
        int missingNum = 0;
        for (int num : list){
            if(Arrays.binarySearch(array, num)<0){
                missingNum = num;
                break;
            }
        }
        System.out.println(missingNum);
    }
}
