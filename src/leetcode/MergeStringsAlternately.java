package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class MergeStringsAlternately {
    //1768. Merge Strings Alternately
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        HashMap<String, String> list = new HashMap<>();
        list.put(word1, word2);
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if(i<word1.length())
                merge.append(word1.charAt(i));
            if (i<word2.length())
                merge.append(word2.charAt(i));
        }
        return merge.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        MergeStringsAlternately m1 = new MergeStringsAlternately();
        String result = m1.mergeAlternately(word1,word2);
        System.out.println(result);
    }
}
