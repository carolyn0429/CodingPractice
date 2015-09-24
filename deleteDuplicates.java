public ListNode deleteDuplicates(ListNode head) {
        //head is null
        if (head == null) return null;
        if (head !=null && head.next == null) return head;
        else if (head !=null && head.next.val == head.val) {
            head.next=null;
            return head;
        }else{
            ListNode list = head;
            ListNode next = head.next;
            while(list !=null && next !=null){
                if (list.val == list.next.val){
                    next = list.next.next;
                }else{
                    list = list.next;
                    
                }
            }//end while
            return list;
        }
    }