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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root==null)
            return arr;
        TreeNode p = root;
        while(!s.isEmpty()||p!=null){
            if(p!=null){
                s.push(p);
                p = p.left;
            }   
            else{
                TreeNode poped = s.pop();
                arr.add(poped.val);
                p = poped.right;
            }
        }
        return arr;
    }
}
