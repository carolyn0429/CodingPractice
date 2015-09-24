public List<String> binaryTreePaths(TreeNode root) {
	List<String> list = new ArrayList<String>();
	List<TreeNode> buffer = new ArrayList<TreeNode>();
	dfs(root, buffer, list);
	return res;
        
}

private void dfs(TreeNode root,List<TreeNode> buffer, List<String> res){
	if (root==null) return;
	if(root.left==null && root.right==null){
		//get app TreeNodes from buffer and print/add them into res
		StringBuilder sb = new StringBuilder();
		for (TreeNode node: buffer){
			sb.append(node.val).append("->");
		}
		sb.append(root.val);
		res.add(sb.toString());
	}else{
		buffer.add(root);
		dfs(root.left, buffer, res);
		dfs(root.right, buffer, res);
		buffer.remove(buffer.size()-1);
	}
}