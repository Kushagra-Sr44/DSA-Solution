// https://leetcode.com/problems/count-good-nodes-in-binary-tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int dfs(TreeNode root,int maxVal){
        if(root.right==null && root.left==null){
            if(root.val>=maxVal) return 1;
            return 0;
        }
        int c=0;
        int left=0;
        int right=0;
        if(root.val>=maxVal){
            maxVal=root.val;
            c=1;
        }
        if(root.left!=null){
            left=dfs(root.left,maxVal);
        }
        if(root.right!=null){
            right=dfs(root.right,maxVal);
        }
        return c+left+right;
    }
    public int goodNodes(TreeNode root) {
      return dfs(root,root.val);
    }
}
