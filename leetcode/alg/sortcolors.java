public class Solution {
    public void sortColors(int[] nums) {
        int countArray[] = new int[3];
        for(int i=0;i<nums.length;i++)
            countArray[nums[i]]++;
        int k=0;
        int color[]={0,1,2};
        for(int i=0;i<3;i++){
            int count = countArray[i];
            for(int j=0;j<count;j++)
                nums[k++]=color[i];
        }
    }
}
