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
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    
    public int treeSum(TreeNode root){
        int leftSum = 0,rightSum=0;
        if(root.left!=null)
            leftSum = treeSum(root.left);
        if(root.right!=null)
            rightSum = treeSum(root.right);
        int totSum = leftSum + rightSum + root.val;
        if(h.containsKey(totSum)){
            int c = h.get(totSum);
            h.put(totSum,c+1);
        }
        else
            h.put(totSum,1);
        return totSum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        int r[] = {};
        if(root==null)
            return r;
        treeSum(root);    
        int max = Integer.MIN_VALUE;
        for(int v:h.values()){
            if(v>max)
                max=v;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(HashMap.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==max)
                arr.add(entry.getKey());
        }
        int a[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            a[i] = arr.get(i);
        return a;    
    }
}/* Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

Examples 1
Input:

  5
 /  \
2   -3

return [2, -3, 4], since all the values happen only once, return all of them in any order.

Examples 2
Input:

  5
 /  \
2   -5

return [2], since 2 happens twice, however -5 only occur once.

Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer. */
