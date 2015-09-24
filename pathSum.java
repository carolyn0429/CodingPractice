public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        if (root==null) return result;
        
        else {
            path.add(root.val);
        	dfs(root, sum-root.val, path, result);
        	return result;
        }
    }//pathSum
    public static void dfs(TreeNode node, int sum, List<Integer> path, List<List<Integer>> res){
	
    	if (sum==0 && node.left==null && node.right == null) {
    		List<Integer> temp = new ArrayList<Integer>();
    		temp.addAll(path);
    		res.add(temp);
    	}
    	if (node.left!=null){
    		path.add(node.left.val);
    		dfs(node.left, sum-node.left.val, path, res);
    		path.remove(path.size()-1);
    	}
    	if (node.right!=null){
    		path.add(node.right.val);
    		dfs(node.right, sum-node.right.val, path, res);
    		path.remove(path.size()-1);
    	}		
    }//dfs