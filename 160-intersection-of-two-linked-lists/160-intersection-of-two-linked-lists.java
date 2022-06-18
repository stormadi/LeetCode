/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        {
            return null;
        }
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA!=null)
        {
            while(currB!=null)
            {
                if(currB == currA)
                {
                    return currA;
                }
                else
                {
                    currB = currB.next;
                }
            }
            currB = headB;
            currA = currA.next;
        }
        return null;
    }
}