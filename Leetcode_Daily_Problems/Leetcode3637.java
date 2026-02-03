public class Leetcode3637 {
    class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (nums[1] <= nums[0]) return false;
        int i = 2;
        while (i < n && nums[i] > nums[i - 1]) i++;
        if (i == n) return false;
        while (i < n && nums[i] < nums[i - 1]) i++;
        if (i == n) return false;
        for (int k = i; k < n; k++) {
            if (nums[k] <= nums[k - 1]) return false;
        }

        return true;
    }
}
    
}
