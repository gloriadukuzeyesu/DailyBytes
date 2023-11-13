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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode res = dummy; 
        int carry = 0; 
        while(l1 != null && l2!= null) {
            int sum = carry + l1.val + l2.val; 
            dummy.next = new ListNode(sum % 10); 
            carry = sum / 10; 
            dummy = dummy.next; 
            l1 = l1.next; 
            l2 = l2.next; 
        }
        while(l1 != null) {
            int sum = carry + l1.val; 
            dummy.next = new ListNode(sum % 10); 
             carry = sum / 10; 
             dummy = dummy.next; 
             l1 = l1.next; 
        }
        while(l2 != null) {
            int sum = carry + l2.val; 
             dummy.next = new ListNode(sum % 10); 
             carry = sum / 10; 
             dummy = dummy.next; 
             l2 = l2.next; 
        }
        if(carry != 0) {
            dummy.next = new ListNode(carry); 
        }
        
        return res.next; 
    }
}