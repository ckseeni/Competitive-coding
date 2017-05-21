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
    public int c = 0;
    public HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    public HashSet<Integer> h1 = new HashSet<Integer>();
    public void value(TreeNode root){
        if(root==null)
            return;
        c++;
        if(root.left!=null)
            value(root.left);
        if(root.right!=null)
            value(root.right);
        if(root.left==null&&root.right==null){
            if(!h1.contains(c)){
                h.put(root.val,c);
                h1.add(c);
            }
        }
        c--;
    }
    public int findLeftMostNode(TreeNode root) {
        value(root);
        int max = Integer.MIN_VALUE;
        for(int x:h1){
            if(x>max)
                max = x;
        }
        for(HashMap.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==max)
                return entry.getKey();
        }
        return 0;
    }
}/* Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:

Input:

    2
   / \
  1   3

Output:
1

Example 2:

Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7

Note: You may assume the tree (i.e., the given root node) is not NULL.

*/
