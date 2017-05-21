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
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        int tot = 0;
        if(root!=null){
            if(root.left!=null){
                if(root.left.left==null&&root.left.right==null)
                    tot = tot + root.left.val;
            }
            if(root.left!=null)
                tot=tot+sumOfLeftLeaves(root.left);
            if(root.right!=null)
                tot=tot+sumOfLeftLeaves(root.right);
        }        
        return tot;
    }
}
