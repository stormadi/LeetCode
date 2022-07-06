/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    boolean left = true, right = true;
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(left == false || right == false) return false;
        if(p == null && q == null)
        {
            return true;
        }
        if((p == null && q != null) || (p != null && q == null))
        {
            return false;
        }
        if(p.val == q.val)
        {
            left = isSameTree(p.left, q.left);
            right = isSameTree(p.right, q.right);
        }
        else return false;
        return left && right;
    }
}