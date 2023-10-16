package leetcode;

import java.util.Scanner;

public class LongPressedName {
    //925. Long Pressed Name
    public boolean isLongPressedName(String name, String typed) {
        int len1 = name.length();
        int len2 = typed.length();
        int idx1 = 0;
        int idx2 = 0;
        char prev = name.charAt(0);
        char c2;
        char c1 = prev;

        System.out.println("len1: " + len1);
        System.out.println("len2: " + len2);

        while (idx1 < len1 && idx2 < len2) {
            c1 = name.charAt(idx1);
            c2 = typed.charAt(idx2);

            if (c1 == c2) {
                idx1++;
                idx2++;
                prev = c1;
            } else if (c2 == prev) {
                idx2++;
            } else {
                return false;
            }
        }

        while (idx2 < len2) {
            c2 = typed.charAt(idx2);
            if (c2 != c1) {
                return false;
            }
            idx2++;
            System.out.println(idx2);
        }

        return idx1 == len1 && idx2 == len2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String typed = sc.next();
        LongPressedName solution = new LongPressedName();
        boolean result = solution.isLongPressedName(name, typed);
        System.out.println(result);
    }
}