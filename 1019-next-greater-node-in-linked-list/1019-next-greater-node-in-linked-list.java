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
    public int[] nextLargerNodes(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode curr = head; curr != null; curr = curr.next)
        {
            arr.add(curr.val);
        }
        int[] ans = new int[arr.size()];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.size(); i++)
        {
            while(!st.isEmpty() && arr.get(st.peek()) < arr.get(i))
            {
                ans[st.pop()] = arr.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}