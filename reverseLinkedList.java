public boolean isPalindrome(ListNode head) {
        
        if (head==null || head.next==null) return true;
        
        //use fast and slow two pointers to find out middle point
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode oldList = head;
        ListNode midPoint = slow.next;
        slow.next = null;
        ListNode newList = reverseLinkedList(midPoint);
        //check next node's value is equal to reverse list node's value
        while(newList!=null){
            if (newList.val != oldList.val){
                return false;
            }
            newList = newList.next;
            oldList = oldList.next;
        }
        return true;
    }
public ListNode reverseLinkedList(ListNode head){
	
	if (head == null || head.next == null)
        return head;
        
    ListNode dummy = new ListNode(0);
	dummy.next = head;
    ListNode prev = head;	
	ListNode cur = head.next;
	head.next = null;	
	while(cur.next!= null){

		//extract cur.next because it will be changed later
		ListNode temp = cur.next;
		cur.next = prev;
		prev = cur;
		cur = temp;
	}
	cur.next = prev;
	dummy.next = cur;
	return dummy.next;
}

