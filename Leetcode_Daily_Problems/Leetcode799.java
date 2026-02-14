public class Leetcode799 {
    class Solution {
    public double champagneTower(int poured, int row, int glass) {
       double dp[]=new double[row+2];
       dp[0]=poured;
       for(int r=0;r<row;r++){
        double[] next_row=new double[row+2];
        for(int g=0;g<=r;g++){
            double amount = dp[g];
            if(amount>1.0){
                double excess=(amount - 1.0) / 2.0;
                next_row[g]+=excess;
                next_row[g+1]+=excess;
            }
        }
        dp=next_row;
       }
       return Math.min(dp[glass],1.0);

    }
}
    
}
