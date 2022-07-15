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
    int sum = 0;
    public void traversal(TreeNode root, int curr)
    {
        if(root != null)
        {
            curr = (curr << 1) | root.val;
            if(root.left == null && root.right == null) sum += curr;
            traversal(root.left, curr);
            traversal(root.right, curr);
        }
    }
    public int sumRootToLeaf(TreeNode root) 
    {
        traversal(root, 0);
        return sum;
    }
}