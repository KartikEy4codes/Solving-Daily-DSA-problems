package Day_01;
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result= binSearchceil(letters,target);
        return result;
        
    }
    public static char binSearchceil(char[] arr,char target){
        char ans='$';
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st + (end-st)/2;
            if(arr[mid]<=target){
                st=mid+1;
            }
            else{
                end=mid-1;
                ans=arr[mid];
            }

        }
        return (ans=='$')?arr[0]:ans;
    }
}