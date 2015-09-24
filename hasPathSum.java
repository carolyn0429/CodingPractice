public boolean hasPathSum(TreeNode root, int sum){
	
	//root is null
	if (root == null) return false;
	if (root.val == sum && root.left == null && root.right==null){
		return root.val;
	}else{
		return (hasPathSum((root.left), sum-root.val) || hasPathSum(root.right, sum-root.val));
	}
}