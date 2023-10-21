package leetcode;

import java.util.Scanner;

class ConsecutiveCharacters {
    //1446. Consecutive Characters
    public int maxPower(String s) {
        int length = s.length();
        int longest = 1;
        int max = longest;
        for(int i=0; i<length-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) {
                longest++;
                max = Math.max(max, longest);
            }
        }
        return max;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            String s = sc.next();
            ConsecutiveCharacters solution = new ConsecutiveCharacters();
            int rest = solution.maxPower(s);
            System.out.println(rest);
        }
    }
}