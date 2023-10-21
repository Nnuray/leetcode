package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {
    //739. Daily Temperatures
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int length = temperatures.length;
        int[] ans = new int[length];
        for (int i = length-1; i>=0; i--) {
            while(!temp.isEmpty() && temperatures[i]>=temperatures[temp.peek()]){
                    temp.pop();
                }
                if(!temp.isEmpty()){
                    ans[i]=temp.peek()-i;
                }
                temp.push(i);
            }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i=0; i<length; i++){
            array[i] = sc.nextInt();
        }
        DailyTemperatures solution = new DailyTemperatures();
        int [] res = solution.dailyTemperatures(array);
        for(int temper : res) {
            System.out.println(temper);
        }
    }
}
