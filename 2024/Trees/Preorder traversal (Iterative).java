class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> list = new ArrayList<> ();
        Stack<Node> st = new Stack<> ();
        if(root != null) st.push(root);
        while(st.size() > 0) {
            Node temp = st.peek();
            list.add(temp.data);
            st.pop();
            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        
        }
        return list;
    }
    
    
}
