//two pointers
public Node findNthFromLast(Node head, int n){
	Node fast = head;
	Node slow = head;
	int count=0;
	while(count<n){
		fast = fast.next;
		count++;
	}
	while(fast.next!=null){
		fast = fast.next;
		slow=slow.next;
	}
	return slow;
}