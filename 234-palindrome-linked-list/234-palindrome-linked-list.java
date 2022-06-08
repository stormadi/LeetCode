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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
        {
            return true;
        }
        if(head.next.next == null)
        {
            if(head.val == head.next.val)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        Stack<Integer> half = new Stack<Integer>();
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            half.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        while(slow != null)
        {
            if(slow.val == half.peek())
            {
                slow = slow.next;
                half.pop();
            }
            else return false;
        }
        return true;
    }
}