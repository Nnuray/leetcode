import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long k = scanner.nextLong();
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextLong();
        }

        Arrays.sort(a);

        long minContribution = a[0];
        long maxContribution = a[N - 1];

        long difference = maxContribution - minContribution;

        while (difference > 0 && k > 0) {
            long needed = (a[1] - minContribution) * (N - 1);

            if (k >= needed) {
                minContribution += 1;
                k -= needed;
                difference -= 1;
            } else {
                break;
            }
        }

        System.out.println(difference);
    }
}
