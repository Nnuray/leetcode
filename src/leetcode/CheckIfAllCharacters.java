package leetcode;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfAllCharacters {
    //1941. Check if All Characters Have Equal Number of Occurrences
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Repeated> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                Repeated repeated = charCount.get(c);
                repeated.increment();
            } else {
                charCount.put(c, new Repeated(String.valueOf(c), 1));
            }
        }

        int sum = 0;
        for (Repeated repeated : charCount.values()) {
            if (sum == 0) {
                sum = repeated.getRepeated();
            } else {
                if (repeated.getRepeated() != sum) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        CheckIfAllCharacters checker = new CheckIfAllCharacters();
        boolean result = checker.areOccurrencesEqual(word);
        System.out.println(result);
    }
}
@Getter
@Setter
class Repeated {
    private String word;
    private int repeated;

    public Repeated(String word, int repeated) {
        this.word = word;
        this.repeated = repeated;
    }

    public int getRepeated() {
        return repeated;
    }

    public void increment() {
        repeated++;
    }
}
