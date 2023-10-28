package leetcode;

import java.util.Scanner;

public class TwoSumInputArraySorted {
    //167. Two Sum II - Input Array Is Sorted
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int [] empty = {-1, -1};

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return empty;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSumInputArraySorted solution = new TwoSumInputArraySorted();
        int[] res = solution.twoSum(array, target);
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < res.length; i++) {
            result.append(res[i]);
            if (i < res.length - 1) {
                result.append(",");
            }
        }
        result.append("]");
        System.out.println(result.toString());
    }
}
