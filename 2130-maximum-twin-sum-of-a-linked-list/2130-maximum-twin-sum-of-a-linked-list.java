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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        int len = 0, i = 0, sum = 0, temp = 0;
        while(curr!=null)
        {
            len++;
            curr = curr.next;
        }
        int arr[] = new int[len];
        curr = head;
        while(curr!=null)
        {
            arr[i] = curr.val;
            curr = curr.next;
            i++;
        }
        for(i = 0; i < len; i++)
        {
            temp = arr[i] + arr[len-1-i];
            if(sum<temp)
            {
                sum = temp;
            }
        }
        return sum;
    }
}