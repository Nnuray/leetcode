package contest2;

import java.util.Scanner;
import java.util.TreeSet;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] positions = new int[n];

        for (int i = 0; i < n; i++) {
            positions[i] = sc.nextInt();
        }

        calculateLongestPassage(x, n, positions);

    }

    private static void calculateLongestPassage(int x, int n, int[] positions) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(x);
        int[] lengths = new int[n];

        for (int i = 0; i < n; i++) {
            set.add(positions[i]);
            Integer lower = set.lower(positions[i]);
            Integer higher = set.higher(positions[i]);
            lengths[i] = higher - lower;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(lengths[i] + " ");
        }
    }
}
