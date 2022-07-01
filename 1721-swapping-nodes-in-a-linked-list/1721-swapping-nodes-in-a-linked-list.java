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
class Solution 
{
    public ListNode swapNodes(ListNode head, int k) 
    {
        if(head.next == null)
        {
            return head;
        }
        ListNode curr = head;
        ListNode A = null;
        ListNode B = null;
        int length = 1;
        int count = 1;
        while(curr.next != null)
        {
            curr = curr.next;
            length++;
        }
        curr = head;
        while(curr != null)
        {
            if(count == k)
            {
                A = curr;
            }
            if(count == length - k + 1)
            {
                B = curr;
            }
            curr = curr.next;
            count++;
        }
        count = A.val;
        A.val = B.val;
        B.val = count;
        return head;
    }
}