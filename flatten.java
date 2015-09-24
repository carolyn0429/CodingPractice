public void flatten(TreeNode root) {  
   TreeNode cur = root;  
   Stack<TreeNode> rtrees = new Stack<TreeNode>();  
   while (cur != null) {  
     while (cur.left != null) {  
       if (cur.right != null) rtrees.push(cur.right);  
       cur.right = cur.left;  
       cur.left = null;  
       cur = cur.right;  
     }  
     if (cur != null && cur.right == null && !rtrees.isEmpty()) {  
       cur.right = rtrees.pop();  
     }  
     cur = cur.right;  
   }  
 }  
//poor efficiency because it needs to reconstruct the tree
public void flatten(TreeNode root) {
	
	List<TreeNode> path = new ArrayList<TreeNode>();
	TreeNode node = root;
	dfs(node, path);
	for (int i=1;i<path.size();i++){
		root.left =null;
		root.right = path.get(i);
		root=root.right;
	}
        
}

private void dfs(TreeNode root, List<TreeNode> path){

	if (root==null) return;
		path.add(root);
		dfs(root.left, path);
		dfs(root.right, path);
}