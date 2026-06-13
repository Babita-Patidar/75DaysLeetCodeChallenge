/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null) return head;
    
        ListNode slow=head;
        
        while(slow!=null && slow.next!=null){
            int temp=slow.val;
            slow.val=slow.next.val;
            slow.next.val=temp;
            slow=slow.next.next;
            
        }
        return head;
        
    }
}