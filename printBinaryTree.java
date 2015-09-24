/*
Print a binary tree without using recursion.  

*/

/*
	print the binary tree w/o using recursion
	@param root binary tree root
	using "Stack"
*/

//inorder print tree
public void printBinaryTree(Node root){
	Stack<Node> stack = new Stack<Node>();
	Node cur = root;
	stack.push(cur);
	while(cur!=null){
		cur = cur.left;
		stack.push(cur);
		
	}//while
	while (!stack.isEmpty()){
			Node cur = stack.pop();
			System.out.println(cur.val);
			while(cur.right!=null){
				cur=cur.right;
				stack.push(cur);				
			}
			
		}//if
	
}

