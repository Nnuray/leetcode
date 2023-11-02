package contest;

import java.util.Scanner;

public class C1 {
    //wrong
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt();
            }

            int replacements = 0;
            for (int i = 0; i < n - 2; i += 2) {
                if (v[i] != v[i + 2]) {
                    replacements++;
                } else if(v[i]==v[i+1]){
                    replacements++;
                }
            }

            System.out.println(replacements);
        }
    }
