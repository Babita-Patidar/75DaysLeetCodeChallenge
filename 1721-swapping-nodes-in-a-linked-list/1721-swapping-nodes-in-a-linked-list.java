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
    public ListNode swapNodes(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;

        }
        ListNode a=head;
        for(int i=1;i<k;i++){
            a=a.next;
        }
        ListNode b=head;
        for(int i=1; i<n-k+1;i++){
            b=b.next;
        }
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
        return head;
        
    }
}