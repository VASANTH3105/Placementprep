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
    int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root == null) return 0;
        if(root.left!= null&&root.left.left == null && root.left.right == null){
            count += root.left.val;
        }
            int ln = sumOfLeftLeaves(root.left);
            int rn = sumOfLeftLeaves(root.right);
        
        return count;


        
    }
}
