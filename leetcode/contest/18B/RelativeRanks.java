public class Solution {
    public int findPos(int t,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t)
                return i;
        }
        return 0;
    }
    public String[] findRelativeRanks(int[] nums) {
        String a[] = {};
        if(nums.length==0)
            return a;
        int[] pos = new int[nums.length];
        int[] so = new int[nums.length];
        for(int i=0;i<so.length;i++)
            so[i] = nums[i];
        Arrays.sort(so);
        int j=1;
        for(int i=so.length-1;i>=0;i--){
            int p = findPos(so[i],nums);
            pos[p] = j;
            j++;
        }
        String res[] = new String[nums.length];
        for(int i=0;i<pos.length;i++){
            if(pos[i]>3)
                res[i] = Integer.toString(pos[i]);
            if(pos[i]==1)
                res[i] = "Gold Medal";
            if(pos[i]==2)
                res[i] = "Silver Medal";
            if(pos[i]==3)
                res[i] = "Bronze Medal";
        }
        return res;
    }
}/* Given scores of N athletes, find their relative ranks and the men with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:

    N is a positive integer and won't exceed 10,000.
    All the sores of athletes are ensure to be unique.

*/
