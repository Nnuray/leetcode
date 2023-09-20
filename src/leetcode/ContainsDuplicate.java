package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    //217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

}
