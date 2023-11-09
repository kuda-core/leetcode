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
    public boolean isSymmetric(TreeNode root) {
        //in order traversal
        if(root == null)
            return true;
        return inorder(root.left, root.right);
    }

    public boolean inorder(TreeNode p, TreeNode q) {
        //base case
        if(p == null & q == null)
            return true;
        if(p == null || q == null)
            return false;
        System.out.println("l="+p.val+" r="+q.val);
        return p.val == q.val && inorder(p.left,q.right)
            && inorder(p.right, q.left);
    }

}
