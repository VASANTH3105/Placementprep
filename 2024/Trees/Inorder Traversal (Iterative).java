class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> list = new ArrayList<> ();
        Stack<Node> st = new Stack<> ();
        if(root != null) st.push(root);
        while(st.size() > 0) {
            Node temp = st.peek();
            if(temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            } else {
                list.add(temp.data);
                st.pop();
                if(temp.right != null) st.push(temp.right);
            }
            
        }
        return list;
    }
    
    
}
