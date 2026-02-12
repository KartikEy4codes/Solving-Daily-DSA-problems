public class Leetcode3713 {
    class Solution {
    public int longestBalanced(String s) {
        int maxLen = 0;
        for(int i = 0; i<s.length(); i++){
            int maxFreq = 0;
            int unique = 0;
            int freq[] = new int[26];
            for(int j = i; j<s.length(); j++){
                int idx = s.charAt(j) - 'a';
                if(freq[idx] == 0){ 
                    unique++;
                }
                freq[idx]++;
                maxFreq = Math.max(maxFreq, freq[idx]);
                int len = j-i+1;
                if(maxFreq*unique == len){
                    maxLen = Math.max(maxLen, len); 
                }
            }
        }
        return maxLen;
    }
}
    
}
