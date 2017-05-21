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
    public HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    public void traverse(TreeNode root){
        if(root!=null){
            if(h.containsKey(root.val)){
                int c = h.get(root.val);
                h.put(root.val,c+1);
            }
            else
                h.put(root.val,1);
            if(root.left!=null)
                traverse(root.left);
            if(root.right!=null)
                traverse(root.right);
        }
    }
    public int[] findMode(TreeNode root) {
            traverse(root);
            ArrayList<Integer> arr = new ArrayList<Integer>();
            //int k = 0;
            int max = Integer.MIN_VALUE;
            for(int value:h.values()){
                if(max<value)
                    max = value;
            }
            for(Integer key:h.keySet()){
                int value = h.get(key);
                if(value==max)
                    arr.add(key);
            }
            int ar[] = new int[arr.size()];
            for(int k=0;k<arr.size();k++)
                ar[k] = arr.get(k);
            return ar;
    }
}/*
Given a binary tree with duplicates. You have to find all the mode(s) in given binary tree.

For example:
Given binary tree [1,null,2,2],

   1
    \
     2
    /
   2

return [2].

Note: If a tree has more than one mode, you can return them in any order. */
