public class Solution {
    public List<Integer> grayCode(int n) {
        if(n==0){
            List<Integer> arr = new ArrayList<Integer>();
            arr.add(0);
            return arr;
        }    
        List<Integer> arr = grayCode(n-1);
        int addingNumber = (int)Math.pow(2,n-1);
        for(int i=arr.size()-1;i>=0;i--)
            arr.add(arr.get(i)+addingNumber);
        return arr;
    }
}
