package contest;

import java.util.Arrays;

public class SuffixArray {
    private String[] suffixes;

    public SuffixArray(String text) {
        int n = text.length();
        suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = text.substring(i);
        }
        Arrays.sort(suffixes);
    }

    public int indexOf(String pattern) {
        int left = 0;
        int right = suffixes.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = suffixes[mid].startsWith(pattern) ? 0 : suffixes[mid].compareTo(pattern);
            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "banana";
        SuffixArray suffixArray = new SuffixArray(text);
        String pattern = "ba";
        int index = suffixArray.indexOf(pattern);
        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}
