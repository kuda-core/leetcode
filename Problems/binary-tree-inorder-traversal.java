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
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ret;
    }

    //https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/#
    public void inorder(TreeNode node) {
        //base case
        if(node == null)
            return;
        //left
        inorder(node.left);
        //process
        ret.add(node.val);
        //right
        inorder(node.right);
    }
}
