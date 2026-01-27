package Day_01;

import java.util.HashSet;
import java.util.Set;

public class Leetcode287 {
    class Solution {
    
    public int findDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return nums.length;
        
    }
}
}
