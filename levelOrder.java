//BFS
public ArrayList<ArrayList<Integer>> levelOrderBFS(TreeNode root) {
	Queue<TreeNode> queue =  new LinkedList<TreeNode>();
	queue.add(root);
	int currentLevelCount=1;
	int nextLevelCount=0;

	while(!queue.isEmpty()){
		TreeNode n = queue.remove();
		System.out.println(n.data+" ");
		if (n.left!=null){
			queue.add(n.left);
			nextLevelCount++;
		}
		if (n.right!=null){
			queue.add(n.right);
			nextLevelCount++;
		}
		currentLevelCount--;
		if (currentLevelCount==0){
			System.out.println("");
			currentLevelCount=nextLevelCount;
			nextLevelCount=0;
		}
	}
}

//DFS
public static void printLevelOrderDFS(TreeNode node, int level){

	//maxLevel
	int height = maxLevel(node);

	//printLevel
	for (int i=0;i<height;i++){
		printLevel(node, i);
		System.out.println();
	}
}

public static void printLevel(TreeNode node, int level){
	if (node==null) return;
	if (level == 0) {
		System.out.println(node.data+" ");
	}else{
		printLevel(node.left, level-1);
		printLevel(node.right, level-1);
	}
}

public static int maxLevel(TreeNode root){
	if (root==null) retrun 0;
	return 1+Math.max(maxLevel(root.left), maxLevel(root.right));
}