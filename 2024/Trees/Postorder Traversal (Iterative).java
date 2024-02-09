class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> list = new ArrayList<> ();
        Stack<Node> st = new Stack<> ();
        if (node != null) st.push(node);
        while(st.size() > 0) {
            Node temp = st.peek();
            if(temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            } else if ( temp.right != null) {
                st.push(temp.right);
                temp.right = null;
            } else {
                list.add(temp.data);
                st.pop();
            }
        }
        return list;
        
    }
}
