package contest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RedCanteen {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[] > events = new ArrayList<>();
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            events.add(new int[]{a,1});
            events.add(new int[]{b, -1});
        }
        Collections.sort(events, (event1, event2) ->{
            if(event1[0] != event2[0]){
                return event1[0] - event2[0];
            } else {
                return event2[1]-event1[1];
            }
        });
        int maxStudent = 0;
        int currentStudent = 0;
        for(int[] event : events){
            currentStudent += event[1];
            maxStudent = Math.max(maxStudent, currentStudent);
        }
        System.out.println(maxStudent);
    }
}