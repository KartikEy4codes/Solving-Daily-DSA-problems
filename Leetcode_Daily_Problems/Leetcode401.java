import java.util.ArrayList;
public class Leetcode401 {
    class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) { 
                int totalBits = Integer.bitCount(h) + Integer.bitCount(m); 
                if (totalBits == turnedOn) {
                    String time = h + ":" + 
                                  (m < 10 ? "0" + m : m);
                    result.add(time);
                }
            }
        }
        return result;
    }
}
    
}
