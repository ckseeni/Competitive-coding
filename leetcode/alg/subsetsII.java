public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int tot = (int)Math.pow(2,nums.length);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> h = new HashSet<List<Integer>>();
        for(int i=0;i<tot;i++){
            String bin = Integer.toString(i,2);
            StringBuffer b = new StringBuffer();
            int d = nums.length-bin.length();
            for(int k=0;k<d;k++)
                b.append("0");
            b.append(bin);
            bin = b.toString();
            List<Integer> set = new LinkedList<Integer>();
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1')
                    set.add(nums[j]);
            }
            if(!h.contains(set)){
                arr.add(set);
                h.add(set);
            }
        }
        return arr;    
    }
}
/*
 Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

*/
