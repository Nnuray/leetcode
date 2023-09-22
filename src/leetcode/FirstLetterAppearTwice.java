package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class FirstLetterAppearTwice {
    //2351. First Letter to Appear Twice
    public char repeatedCharacter(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!characters.add(c)) {
                return c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FirstLetterAppearTwice checker = new FirstLetterAppearTwice();
        char result = checker.repeatedCharacter(s);
        if(result!=0) {
            System.out.println(result);
        } else {
            System.out.println("false");
        }
    }
}
