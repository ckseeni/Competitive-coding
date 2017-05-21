public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int index = h.get(nums[i]);
                if(Math.abs(index-i)<=k)
                    return true;
                h.put(nums[i],i);
            }   
            else
                h.put(nums[i],i);
        }
        return false;
    }
}
