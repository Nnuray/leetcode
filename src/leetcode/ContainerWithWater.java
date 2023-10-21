package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class ContainerWithWater {
    //11. Container With Most Water
    public int MaxArea(int[] height){
        int maxArea=0;
        int length = height.length;

        int left = 0;
        int right = length-1;
        while (left<right) {
           int h = Math.min(height[left],height[right]);
           int s = right-left;
           maxArea = Math.max(maxArea, h*s);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        ContainerWithWater solution = new ContainerWithWater();
        int res = solution.MaxArea(array);
        System.out.println(res);
    }
}
