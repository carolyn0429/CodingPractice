// iterative approach
//BST conditions:
/*
1. The left subtree of a node contains only nodes with keys less than the node’s key.
2. The right subtree of a node contains only nodes with keys greater than the node’s key.
3. Both the left and right subtrees must also be binary search trees.

*/
public boolean isValidBST(TreeNode root){
	return isValidBSTHelper(TreeNode root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public boolean isValidBSTHelper(TreeNode p, int min, int max){
	//if root is null
	if (p==null) return true;

	//check p value's range is within min and max
	if (p.val<=min || p.val>=max){
		return false;
	}

	return isValidBSTHelper(p.left, min, p.val) && isValidBSTHelper(p.right, p.val, max);

}