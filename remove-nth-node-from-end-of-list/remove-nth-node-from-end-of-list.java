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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head.next == null && n == 1)
        {
            head = null;
            return head;
        }
        ListNode curr = head;
        int size = 0;
        while(curr != null)
        {
            size++;
            curr = curr.next;
        }
        int front = size - n;
        curr = head;
        if(front == 0)
        {
            head = head.next;
            return head;
        }
        while(front != 1)
        {
            curr = curr.next;
            front--;
        }
        curr.next = curr.next.next;
        return head;
    }
}