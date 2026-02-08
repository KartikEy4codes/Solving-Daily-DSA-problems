import java.util.*;
public class Leetcode110 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean isBalanced(TreeNode root) {
        ans=true;
        depth(root);
        return ans;
    }
        boolean ans;
        public int depth(TreeNode root){
        if(root==null) return 0;
        int left =depth(root.left);
        int right=depth(root.right);
        if(Math.abs(left-right) >1) ans = false;
        return Math.max(left,right) +1;
        
    }
}
    
}
