class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        head.next=null;
        head=prev;
        return prev;
    }
}