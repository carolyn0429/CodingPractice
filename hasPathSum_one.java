/*
*Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
*/
public boolean hasPathSum_one(TreeNode root, int sum) {
	if (root == null) 
            return false;
    	else if (root.val == sum && (root.left ==null && root.right == null)) 
    	    return true;
    	else if (root.left !=null || root.right !=null){
    		return hasPathSum_one(root.left, sum-root.val) || hasPathSum_one(root.right, sum-root.val);
    	}else 
    	    return false;	
}