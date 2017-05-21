/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int Depth(TreeNode root){
        if(root==null)
            return 0;
        int l = Depth(root.left);
        if(l!=-1){
            int r = Depth(root.right);
            if(r!=-1)
                return Math.abs(l-r)<=1?1+Math.max(l,r):-1;
        }
        return -1;
    }
    public boolean isBalanced(TreeNode root) {
        return Depth(root)!=-1;   
    }
}
