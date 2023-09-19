import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    //1. Two Sum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] nums = new int [length];
        for(int i=0; i<length; i++){
            nums[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Результат: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Решение не найдено.");
        }
    }
}
