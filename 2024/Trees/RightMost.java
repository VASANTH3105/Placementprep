class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>(); // Initialize the result list
        if (root == null) return rightView; // Handle the case of an empty tree

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Integer rightmost = null; // To track the rightmost node at each level

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                // Update the rightmost node for each level
                rightmost = current.val;

                // Enqueue the child nodes for the next level
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            // Add the rightmost node of the current level to the result list
            rightView.add(rightmost);
        }

        return rightView;
    }
}
