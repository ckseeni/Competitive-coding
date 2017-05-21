public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int index[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                index[0] = h.get(nums[i]);
                index[1] = i;
                break;
            }
            else
                h.put(target-nums[i],i);
        }
        return index;
    }
}
