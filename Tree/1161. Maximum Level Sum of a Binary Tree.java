//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree

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
    public int maxLevelSum(TreeNode root) {
        ArrayDeque<TreeNode> arr=new ArrayDeque<>();
        arr.addLast(root);
        arr.addLast(new TreeNode(100005));
        long maxsum=root.val;
         long sum=0;
         int lev=1;
         int c=1;
        while(!arr.isEmpty()){
            TreeNode node=arr.removeFirst();
         if(node.val==100005){
            if(sum>maxsum){
                maxsum=sum;
                lev=c;
            }
            if(arr.isEmpty()) break;
            arr.add(new TreeNode(100005));
              c++;
                 sum=0;
         }
         else{
            sum+=node.val;
            if(node.right!=null) arr.addLast(node.right);
            if(node.left!=null) arr.addLast(node.left);
         }
        }
        return lev;
    } 
}
