//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers
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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) return 0;
       return  helper(root, "");
    }

    public int helper(TreeNode root, String st) {
        if (root == null) {
           return 0;
        }
        if(root.right==null && root.left==null){
            st+=root.val;
             int val = Integer.valueOf(st, 2);
            return  val;
        }
       int l= helper(root.left, st + root.val);
       int r= helper(root.right, st+root.val);
       return l+r;
    }
}
