package contest;

import java.util.Scanner;

public class SUU {
    public static int Operations(String word) {
        int operations = 0;
        String suu = "SUU";
        while (!word.equals(suu)) {
            int len = word.length();

            if(len <= 2){
                return -1;
            }
            if (word.charAt(0) == 'U') {
                word = "S" + word.substring(1);
                operations++;
                //System.out.println("First letter changed");
                //System.out.println(word);
            } else if (word.charAt(0) == 'S' && word.charAt(1) == 'S') {
                word = word.substring(1);
                operations++;
                //System.out.println("Deleted first letter");
                //System.out.println(word);
            } else if (word.charAt(len - 1) == 'S') {
                word = word.substring(0, len - 1) + "U";
                operations++;
                //System.out.println("Last letter changed");
                //System.out.println(word);
            } else if (word.charAt(len - 1) == 'U' && word.charAt(len - 2) == 'U' && word.charAt(len - 3) == 'U') {
                word = word.substring(0, len - 1);
                operations++;
                //System.out.println("Deleted last letter");
                //System.out.println(word);
            } else {
                return -1;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int result = Operations(word);

            if (result == -1 && !word.equals("SUU")) {
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        }
        sc.close();
    }
}