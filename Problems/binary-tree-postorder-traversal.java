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
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);

        return ret;
    }
    public void  postorder(TreeNode curr) {
        if(curr == null)
            return;

        //left
        postorder(curr.left);
        //right
        postorder(curr.right);
        //in
        ret.add(curr.val);
    }
}
