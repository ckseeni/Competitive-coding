public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(nums==null)
            return arr;
        int c1 = 0,c2=0,can1=0,can2=0;
        for(int n:nums){
            if(n==can1)
                c1++;
            else if(n==can2)
                c2++;
            else if(c1==0){
                c1=1;
                can1 = n;
            }
            else if(c2==0){
                c2=1;
                can2 = n;
            }
            else{
                c2--;
                c1--;
            }
        }
        int count1=0,count2=0;
        for(int n:nums){
            if(n==can1)
                count1++;
            if(n==can2)
                count2++;
        }
        if(count1>(int)(nums.length/3))
            arr.add(can1);
        if(count2>(int)(nums.length/3))
            if(!arr.contains(can2))
                arr.add(can2);
        return arr;
    }
}
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

For those who aren't familiar with Boyer-Moore Majority Vote algorithm,
I found a great article (http://goo.gl/64Nams) that helps me to understand this fantastic algorithm!!
Please check it out!

The essential concepts is you keep a counter for the majority number X. If you find a number Y that is not X, the current counter should deduce 1. The reason is that if there is 5 X and 4 Y, there would be one (5-4) more X than Y. This could be explained as "4 X being paired out by 4 Y".

And since the requirement is finding the majority for more than ceiling of [n/3], the answer would be less than or equal to two numbers.
So we can modify the algorithm to maintain two counters for two majorities.
