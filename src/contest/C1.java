package contest;

import java.util.Arrays;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int[] num = new int[10001];
        Arrays.fill(num,-1);
        int replace = 0;

        for(int i = 0; i < n;i++){
            if(num[arr[i]] == -1 ){
                num[arr[i]] = i;
            }else{
                if((i - num[arr[i]]) % 2 == 0){
                    replace++;

                }
            }
        }
        System.out.println(replace);
    }
}
