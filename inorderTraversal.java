public List<Integer> inorderTraversal(TreeNode root) {
        
        //recursion way
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root==null) return result;
        traverse(root, result);
        return result;
        //left subtree
        //root
        //right subtree
        
    }
    
    private void traverse(TreeNode root, ArrayList<Integer> result){
        if (root==null) return;
        traverse(root.left, result);
        result.add(root.val);
        traverse(root.right, result);
        
    }