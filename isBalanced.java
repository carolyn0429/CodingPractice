 /*1. get left sub-tree height
    2. get right sub-tree height
    3. the height difference btw left and right sub-trees are no more than 1*/
    
    //calculate tree height
    private static int getHeight(TreeNode root){
        if (root==null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (leftHeight==-1 || rightHeight==-1) return -1;
        if (Math.abs(leftHeight-rightHeight)>1) return -1;
        
        return Math.max(leftHeight, rightHeight)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if (getHeight(root)==-1) return false;
        return true;
    }