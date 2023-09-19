import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    //575. Distribute Candies
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candy = new HashSet<>();
        for(int i=0; i<candyType.length; i++){
            candy.add(candyType[i]);
        }
        int maxCandy = candyType.length/2;
        int uniqCandy = candy.size();
        return Math.min(maxCandy, uniqCandy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> candyList = new ArrayList<>();
        while (true){
            int candyType = sc.nextInt();
            if(candyType==0)
                break;
            candyList.add(candyType);
        }
        int [] candyArray = new int[candyList.size()];
        for (int i = 0; i < candyList.size(); i++) {
            candyArray[i]=candyList.get(i);
        }
        Solution solution = new Solution();
        int result = solution.distributeCandies(candyArray);
        System.out.println(result);
    }
}