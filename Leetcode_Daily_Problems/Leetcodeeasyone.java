public package Leetcode_Daily_Problems;

class Leetcodeeasyone {

    class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()==goal.length()){
            String str = s+s;
            int j=0;
            int k=goal.length();
            for(int i=0;i<goal.length();i++){
            String sub = str.substring(j,k);
            if(sub.equals(goal)) return true;
            j++;
            k++;
            }


        }else{
            return false;
        }
       return false;

    }
}
}