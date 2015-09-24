 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

     //null
 	if (l1 == null && l2 == null) return null;
 	ListNode dummy = new ListNode(0);
 //	head.next = null;
 	ListNode head = dummy;
 	while(l1!=null && l2 !=null){
 		if(l1.val <= l2.val){
	 		head.next = l1;
	 		l1 = l1.next;
	 	}else{
	 		head.next = l2;
	 		l2 = l2.next;
	 	}
	 	head = head.next;
 	}
 	if(l1!=null){
 		head.next = l1;
 		
 	}
 	else{
 		head.next = l2;
 	
 	}

 	return dummy.next;
 }