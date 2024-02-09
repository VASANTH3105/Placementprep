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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>> ();
        if(root != null) queue.offer(root);
        
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0 ; i < level ; i++) {
                TreeNode temp = queue.poll();
                subList.add(temp.val);
                if( temp.left != null) queue.offer(temp.left);
                if( temp.right != null) queue.offer(temp.right);
            }
            list.add(subList);
        }
        return list;

        
    }
}
