public ListNode reverseList(ListNode head){
        
        //iterative approach
    if (head==null) return head;

    //general case
    ListNode pre = null;
   
    ListNode cur = head;
    while(cur.next!=null){
        ListNode tmp = cur.next;
        
        cur.next = pre;
        pre = cur;
        cur = tmp;
    }//end while
    cur.next = pre;
    return cur;
   }