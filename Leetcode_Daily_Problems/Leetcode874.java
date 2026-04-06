package Leetcode_Daily_Problems;

import java.util.HashSet;
import java.util.Set;

public class Leetcode874 {

    class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        int ans = 0;    
        Set<String> k = new HashSet<>();
        for (int[] i : obstacles)                              
            k.add(i[0] + "," + i[1]);

        int[][] directions = new int[4][2];

        // FOR NORTH Y ++ (0,1)
        directions[0][0] =  0;
        directions[0][1] =  1;
        // FOR EAST X ++ (1, 0)
        directions[1][0] =  1;
        directions[1][1] =  0;
        // FOR SOUTH Y -- (0, -1)
        directions[2][0] =  0;
        directions[2][1] =  -1;
        // FOR WEST X -- (-1 ,0)
        directions[3][0] =  -1;
        directions[3][1] =  0;

        int direc = 0;   // INITIALLY FACING NORTH

        int x = 0; // COORDINATES
        int y = 0;

        for (int i : commands) 
            if (i == -1)
                direc = (direc + 1) % 4;      
            else if (i == -2)
                direc = (direc + 3) % 4;        
            else {
                for (int j = 0; j < i; j++) {
                    int a = x + directions[direc][0];  
                    int b = y + directions[direc][1];

                    if (k.contains(a + "," + b))   // CHECKING FOR OBSTACLE
                        break;
                    x = a;
                    y = b;

                    ans = Math.max(ans, (x * x) + (y * y));
                }
            }
        return ans;
    }
}
}
