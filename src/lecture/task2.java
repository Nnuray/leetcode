package lecture;

public class task2 {
    static void printSequences(int n, int k, int start, String sequence) {
        if (k == 0) {
            System.out.println(sequence);
            return;
        }

        for (int i = start; i <= n; i++) {
            printSequences(n, k - 1, i + 1, sequence + " " + i);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        printSequences(n, k, 1, "");
    }
}
