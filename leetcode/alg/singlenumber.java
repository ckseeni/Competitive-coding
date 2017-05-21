public class Solution {
    public int singleNumber(int[] nums) {
        int max=-Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);   
        }
        min = -1*min;
        int countp[]  =new int[max+1];
        int countn[]  = new int[min+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)
                countp[nums[i]]++;
            else
                countn[-1*nums[i]]++ ;   
        }
        int re=0;
        for(int i=0;i<max+1;i++){
            if(countp[i]==1){
                re = i;
                break;
            }
        }
         for(int i=0;i<min+1;i++){
            if(countn[i]==1){
                re = -i;
                break;
            }
        }
        return re;
    }
}
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
Another simple logic::::XOR all elements-->returns the only one element....eg:3,4,5,4,3-->3^4^5^4^3=5
