class Solution {
    public void deleteNode(ListNode node) {

        ListNode t=node;
        t.val=t.next.val;
        
        ListNode k=t.next.next;

        t.next.next=null;

        t.next=k;

        
    }
}
