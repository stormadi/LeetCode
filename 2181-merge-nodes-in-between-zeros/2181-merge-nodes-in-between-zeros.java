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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode temp = new ListNode(-1);
        ListNode ans = temp;
        while(curr.next!=null)
        {
            if(curr.val==0)
            {
                int sum = 0;
                curr = curr.next;
                while(curr.val!=0)
                {
                    sum += curr.val;
                    curr = curr.next;
                }
                ListNode newnode = new ListNode(sum);
                temp.next = newnode;
                temp = newnode;
            }
        }
        return ans.next;
    }
}