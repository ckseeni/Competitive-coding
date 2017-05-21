public class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i] = String.valueOf(nums[i]);
        Arrays.sort(arr,new Comparator<String>(){  //defining a comparator for arrays.sort
            public int compare(String a,String b){
                return (b+a).compareTo(a+b);
        }
        });
        StringBuffer re = new StringBuffer();
        for(String a:arr)
            re.append(a);
        while(re.charAt(0)=='0'&&re.length()>1)
            re.deleteCharAt(0);
        return re.toString();
    }
}
