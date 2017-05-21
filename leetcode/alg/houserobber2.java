public class Solution {
    public int rob(int[] nums) {
         if(nums.length==0)
            return 0;
         if(nums.length==1)
            return nums[0];   
         if(nums.length==2)
            return Math.max(nums[0],nums[1]);
         int max1 = robhelper(nums,0,nums.length-2);
         int max2 = robhelper(nums,1,nums.length-1);
         return Math.max(max1,max2);
    }
    public int robhelper(int[] nums,int st,int en) {
        int dp[] = new int[nums.length];
        dp[st] = nums[st];
        dp[st+1] = Math.max(nums[st+1],dp[st]);//eg 2 1 1 2-->2 2 3 4
        for(int i=st+2;i<=en;i++)
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        return dp[en];
    }
}
