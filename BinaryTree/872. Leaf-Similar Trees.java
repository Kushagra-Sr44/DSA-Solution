// https://leetcode.com/problems/leaf-similar-trees

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
    public void leafNode(TreeNode node, List<Integer> arrlist) {
        if (node.left == null && node.right == null) {
            arrlist.add(node.val);
            return;
        }
        if (node.left != null)
            leafNode(node.left, arrlist);
        if (node.right != null)
            leafNode(node.right, arrlist);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        leafNode(root1, arr1);
        leafNode(root2, arr2);
        if (arr1.size() != arr2.size())
            return false;
        for (int i = 0; i < arr1.size(); i++) {
            if ((int)arr1.get(i) != (int)arr2.get(i)){
            return false;
            }
                
        }
        return true;

    }
}
