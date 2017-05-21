public class Solution {
    public int lengthOfLIS(int[] nums) {
    		/*arr:9 1 3 7 5 6 20
			 max=[1
				 [ 1 1
				 [ 1 1 2
					1 1 2 3
                   1 1 2 3 3
                   1 1 2 3 3 4
					1 1 2 3 3 4 5]*/
		if(nums.length==0)
			return 0;
		int max[] = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			max[i]=1;
			for(int j=0;j<i;j++){
				if(nums[i]>nums[j])
					max[i] = Math.max(max[i],max[j]+1);
			}
		}
		int maxr=Integer.MIN_VALUE;
		for(int i=0;i<max.length;i++)
 			maxr = Math.max(maxr,max[i]);
		return maxr;
    }
}
