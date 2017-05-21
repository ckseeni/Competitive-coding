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
    public int robhelper(int[] nums,int length) {
        if(length==0)
            return 0;
        if(length==1)
            return nums[0];
        int dp[] = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);//eg 2 1 1 2-->2 2 3 4
        for(int i=2;i<length;i++)
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        return dp[length-1];
    }
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        int arr[] = new int[1000000];
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        q1.add(root);
        q2.add(1);
        int pos = 0;
        while(!q1.isEmpty()){
            TreeNode s = q1.remove();
            pos = q2.remove();
            arr[pos-1] = arr[pos-1] + s.val;
            if(s.left!=null){
                q1.add(s.left);
                q2.add(pos+1);
            }
            if(s.right!=null){
                q1.add(s.right);
                q2.add(pos+1);
            }
        }
        return robhelper(arr,pos);
    }
}
