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
    public int[][] spiralMatrix(int m, int n, ListNode head)
    {
        int row = 0, col = 0;
        int sizerow = m-1;
        int sizecol = n-1;
        int boundary = n-1;
        int flag = 1; //1->row, 0->col
        char move = 'r';
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m*n; i++)
        {
            if(head != null) matrix[row][col] = head.val;
            else matrix[row][col] = -1;
            //place over change boundary length and update move
            if(i == boundary)
            {
                if(flag == 1)
                {
                    boundary += sizerow;
                    sizerow--;
                    flag = 0;
                }
                else
                {
                    boundary += sizecol;
                    sizecol--;
                    flag = 1;
                }
                switch(move)
                {
                    case 'r':
                        move = 'd';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                }
            }
            //update row and col
            switch(move)
            {
                case 'r':
                    col += 1;
                    break;
                case 'l':
                    col -= 1;
                    break;
                case 'u':
                    row -= 1;
                    break;
                case 'd':
                    row += 1;
                    break;
            }
            if(head != null) head = head.next;         
        }
        return matrix;
    }
}