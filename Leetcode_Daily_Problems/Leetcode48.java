public class Leetcode48 {
    class Solution {
    public void rotate(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length]; 
        int end=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++)
        {
            int initial=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                res[initial][end] = matrix[i][j];
                initial++;
            }
            end--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = res[i][j];
            }
        }
        
    }
}
}
