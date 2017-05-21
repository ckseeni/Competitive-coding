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
    public int[] findValueMostElement(TreeNode root) {
        int a[]={};
        if(root==null)
            return a;
        ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> q;
        arr.add(root);
        res.add(root.val);
        while(arr.size()!=0){
            q = new LinkedList<TreeNode>(arr);
            ArrayList<TreeNode> s = new ArrayList<TreeNode>();
            ArrayList<Integer> s1 = new ArrayList<Integer>();
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                if(node.left!=null)
                    s.add(node.left);
                if(node.right!=null)    
                    s.add(node.right);
                if(node.left!=null)
                    s1.add(node.left.val);
                if(node.right!=null)
                    s1.add(node.right.val);
            }
            Collections.sort(s1);
            if(s1.size()!=0)
                res.add(s1.get(s1.size()-1));
            arr = new ArrayList<TreeNode>(s);
        }
        int result[] = new int[res.size()];
        for(int i=0;i<res.size();i++)
            result[i] = res.get(i);
        return result;
    }
}/*You need to find the largest value in each row of a binary tree.

Example:

Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
*/
