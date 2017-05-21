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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root==null)
            return arr;
        s.push(root);
        while(!s.isEmpty()){
            TreeNode p = s.pop();
            arr.add(p.val);
            if(p.right!=null)
                s.push(p.right);
             if(p.left!=null)
                s.push(p.left);
        }
        return arr;
    }
}
