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
    public TreeNode increasingBST(TreeNode root)
    {
        ArrayList<Integer> data = new ArrayList<>();
        inOrder(root, data);
        TreeNode ans = new TreeNode(0);
        TreeNode curr = ans;
        for(int i = 0; i < data.size(); i++)
        {
            curr.right = new TreeNode(data.get(i));
            curr = curr.right;
        }
        return ans.right;
    }
    public void inOrder(TreeNode root, List<Integer> data)
    {
        if(root == null) return;
        inOrder(root.left, data);
        data.add(root.val);
        inOrder(root.right, data);
    }
}