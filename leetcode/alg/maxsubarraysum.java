public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0],curr_sum = nums[0],left = 0,right = 0,max_left = 0,max_right = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>curr_sum+nums[j]){
                curr_sum = nums[j];
                left = j;
                right = j;
            }
            else{
                curr_sum = curr_sum + nums[j];
                right = j;
            }
            if(curr_sum>sum){
                sum = curr_sum;
                max_left  = left;
                max_right = right;
            }
        }
        return sum;
    }
}
