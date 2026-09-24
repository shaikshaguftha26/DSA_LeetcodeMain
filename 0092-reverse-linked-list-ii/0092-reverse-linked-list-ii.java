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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr=head;// ye move karke hi ham reversal karenge
        ListNode prev=null;
        ListNode before=null;// ye hame left se pehle ki value ke liye 
        int currentPos=1;
        ListNode next=null;// reversal me next node ko store karne ke liye
        while(currentPos<left){
            before=curr;
            curr=curr.next;
            currentPos++;
        }
        if(left==right) return head;
        
        ListNode ref=curr;
        int count=1;
        while(count<=right-left+1){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            
        }
        if(left==1){
            before=null;
                 ref.next=curr;
            return prev;
        }
        if(left>1){
        before.next=prev;
   
        ref.next=curr;

        }
        return head;
        
    }
}