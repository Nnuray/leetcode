package leetcode;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    //1004. Max Consecutive Ones III
    public int longestOnes(int[] nums, int k){
        int length = nums.length;
        int left =0;
        int zeroCount = 0;
        int maxCount = 0;
        for(int i=0; i<length; i++){
            if(nums[i]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxCount=Math.max(maxCount, i-left+1);
        }
        return maxCount; //1,1,1,0,0,0,1,1,1,1,0
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int rest = solution.longestOnes(array, k);
        System.out.println(rest);
    }
}
