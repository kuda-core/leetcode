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
class Solution {
    public List<Integer> ret = new LinkedList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);

        return ret;
    }

    public void preorder(TreeNode curr) {
        if(curr == null)
            return;
        //in
        ret.add(curr.val);
        //left
        preorder(curr.left);
        //right
        preorder(curr.right);
    }
}
