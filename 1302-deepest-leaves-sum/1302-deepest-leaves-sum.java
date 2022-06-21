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
    static int height;
    public int deepestLeavesSum(TreeNode root)
    {
        height = deep(root);
        return sum(root,0);
    }
    public int deep(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return Math.max(deep(root.left),deep(root.right)) + 1;
    }
    public int sum(TreeNode root, int depth)
    {
        if(root == null)
        {
            return 0;
        }
        if(depth == height-1)
        {
            return root.val;
        }
        return sum(root.left,depth+1) + sum(root.right,depth+1);
    }
}