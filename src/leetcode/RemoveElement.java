package leetcode;

import java.util.Scanner;

class RemoveElement {
    //27. Remove Element
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length");
        int length = sc.nextInt();
        System.out.println("Array");
        int [] array = new int[length];
        for(int i=0; i<length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Val");
        int val = sc.nextInt();
        RemoveElement solution = new RemoveElement();
        int size = solution.removeElement(array, val);
        System.out.println("Size is " + size);
        int [] finalArray = new int[size];
        for (int i = 0; i < size; i++) {
            finalArray[i] = array[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}