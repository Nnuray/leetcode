package leetcode;

import java.util.Scanner;

public class TwoSum2 {
    public int[] TwoSum(int[] array, int target){
        int n = array.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = array[left]+array[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            } else if(sum<target){
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSum2 twoSum2 = new TwoSum2();
        int [] twoSum = twoSum2.TwoSum(array, target);
        for(int res : twoSum){
            System.out.println(res);
        }
    }
}
