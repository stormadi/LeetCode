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
    public TreeNode Max(int[] num, int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        int max = 0;
        int index = 0;
        for(int i = left; i <= right; i++)
        {
            if(num[i] >= max)
            {
                max = num[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = Max(num, left, index-1);
        root.right = Max(num, index+1, right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        int l = 0;
        int r = nums.length -1;
        return Max(nums,l,r);
    }
}