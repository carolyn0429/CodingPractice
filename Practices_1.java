public boolean isPalindrome(String s) {
        if (s==null) return true;
        
        String str = s.replaceAll("[^A-Za-z0-9]+","").toLowerCase();
        
        int len = str.length();
        for (int i=0;i<len;i++){
            if (str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

public boolean isPalindrome(int x) {
    if (x==0) return true;
    String num =  String.valueOf(x);
    char[] num_char = num.toCharArray();
    int len = num_char.length;
    for (int i=0;i<len;i++){
        if (num_char[i] != num_char[len-1-i]) return false;
    }
    return t
    rue;
}
public String longestCommonPrefix(String[] strs) {
        
        if (strs==null || strs.length==0) return "";
        //find out minimum string
        int minLen=Integer.MAX_VALUE;
        for (int i=0;i<strs.length;i++){
            if (strs[i].length() < minLen){
                minLen = strs[i].length();
            }
        }
        if (minLen == 0) return "";
        
        //iterate every string to find out prefix
        for (int j=0;j<minLen;j++){
            char prev = '0';
            for (int i=0;i<strs.length;i++){
                if (i==0) {
                    prev = strs[i].charAt(j);
                    continue;
                }//end if
                if (strs[i].charAt(j) != prev)
                return strs[i].substring(0,j);
            }
        }
        return strs[0].substring(0, minLen);
    }
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //create fake head
        ListNode fakeHead = new ListNode(0);
        ListNode p = fakeHead;
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        while(p1 !=null && p2 !=null){
            if (p1.val<p2.val){
                p.next = p1;
                p1=p1.next;
            }else{
                p.next = p2;
                p2=p2.next;
            }
            p = p.next;
        }
        
        if (p1!=null){
            p.next = p1;
        }
        if (p2!=null){
            p.next = p2;
        }
        return fakeHead.next;
    }

 public ListNode removeElements(ListNode head, int val) {
        
        //create fakeHead
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode p = fakeHead;
        
        while(p.next!=null){
            if (p.next.val == val){
                p.next = p.next.next;
            }else
                p = p.next;
        }
        return fakeHead.next;
    }