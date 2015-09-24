public List<ArrayList<Integer>> returnSumPath(int sum, TreeNode root){
	
	List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> path = new ArrayList<Integer>();
	if (root==null) return;
	else{
		path.add(root.val);
		dfs(root, sum-root.val, path, res);
		return res;
	}


}

public void dfs(TreeNode node, int sum, ArrayList<Integer> path, List<ArrayList<Integer>> res){

	
	//first node or last node
	if (sum==0 && node.left ==null && node.right == null){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.addAll(path);
		res.add(temp);
	}

	if (node.left!=null){
		path.add(node.left.val);
		dfs(node.left, sum-node.left.val, path, res);
		path.remove(path.size()-1);
	}

	if(node.right!=null){
		path.add(node.right.val);
		dfs(node.right, sum-node.right.val, path, res);
		path.remove(path.size()-1);
	}
}