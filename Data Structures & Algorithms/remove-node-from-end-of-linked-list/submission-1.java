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
    public int length(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int nodeToRemove = len - n;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        for(int i=0; i<nodeToRemove; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
