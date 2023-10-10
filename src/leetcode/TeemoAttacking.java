package leetcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeemoAttacking {
    //495. Teemo Attacking
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0 || duration==0){
            return 0;
        }
        int totalDuration = 0;
        int poisonEnd = timeSeries[0]+duration-1;
        Map<Integer, Boolean> attacks = new HashMap<>();
        for (int time : timeSeries){
            if(attacks.containsKey(time) && attacks.get(time)){
                totalDuration+=duration;
            } else {
                totalDuration+=duration-1;
                attacks.put(time, true);
            }
        }
        totalDuration+=duration;
        return totalDuration;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeemoAttacking teemoAttacking = new TeemoAttacking();
        int timeSeries[] = new int[2];
        for (int i = 0; i < 2; i++) {
            timeSeries[i] = sc.nextInt();
        }
        int duration = sc.nextInt();
        int result = TeemoAttacking.findPoisonedDuration(timeSeries, duration);
        System.out.println(result);
    }
}
