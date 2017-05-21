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
    public static int flag=0,f=1;
    public boolean check(TreeNode s,TreeNode t){
        if((s==null&&t!=null)||(s!=null&&t==null))
            f=0;
        else if(s!=null&&t!=null){
            if(s.val!=t.val)
                f=0;
            check(s.left,t.left);
            check(s.right,t.right);
        }
        if(f==1)
            return true;
        else
            return false;
    }
    public void Subtree(TreeNode s,TreeNode t){
        f=1;
        if(check(s,t))
            flag=1;
        else{
            if(s.left!=null)
                Subtree(s.left,t);
            if(s.right!=null)
                Subtree(s.right,t);
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        flag=0;f=1;
        Subtree(s,t);
        if(flag==1)
            return true;
        else
            return false;
    }
}
/* Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2

Given tree t:

   4 
  / \
 1   2

Return true, because t has the same structure and node values with a subtree of s.

Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0

Given tree t:

   4
  / \
 1   2

Return false.

*/
