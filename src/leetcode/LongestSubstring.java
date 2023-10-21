package leetcode;

import java.util.Scanner;

public class LongestSubstring{
    public int lengthOfLongestSubstring(String s) {
        int count = 1;
        StringBuilder word = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
                word.append(s.charAt(i));
                System.out.println(word);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LongestSubstring solution = new LongestSubstring();
        int res = solution.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
