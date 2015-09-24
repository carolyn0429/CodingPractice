public int countNodes(TreeNode root) {

	if (root==null) return 0;
	//get hieght of left tree
	int leftHeight = getLeftHeight(root);

	//get height of right tree
	int rightHeight = getRightHeight(root);

	//if left height and right height is equal, nodes = 2^h-1
	if (leftHeight==rightHeight) return (2<<leftHeight)-1;

	//if not equal, get # of node from left sub tree and right sub tree
	else{
		return countNodes(root.left)+countNodes(root.right);
	}

}


public int getLeftHeight(TreeNode node){

	int leftHeight=0;
	if (node==null) return 0;
	while(node.left!=null){
		leftHeight++;
		node = node.left;
	}
	return leftHeight;
}

public int getRightHeight(TreeNode node){

	int rightHeight=0;
	if (node==null) return 0;
	
	while(node.right!=null){
		rightHeight++;
		node = node.right;
	}
	return rightHeight;
}