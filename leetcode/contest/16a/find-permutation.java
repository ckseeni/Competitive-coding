public class Solution {
    public int[] findPermutation(String s) {
        int arr[] = new int[s.length()+1];
        for(int i=0;i<s.length()+1;i++)
            arr[i] = i+1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                int j=i;
                while(j>=0&&arr[j]<arr[j+1]){
                    if(s.charAt(j)=='D'){
                        int tem=arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tem;
                    }
                    j--;
                }
            }
        }
        return arr;
    }
}
