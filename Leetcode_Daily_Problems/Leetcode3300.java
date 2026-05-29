public class Leetcode3300 {
    class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int cur=digitSum(i);
            if(cur<min) min=cur;
        }
        return min;
        
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
           
        }
         return sum;
    }
}
}
