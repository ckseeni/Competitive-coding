public class Solution {
    public int[] constructRectangle(int area) {
        int limit = 0,max = Integer.MAX_VALUE,one=0,two=0;
        if(area%2==0)
            limit = area/2;
        else
            limit = area;
        for(int i=1;i<=limit;i++){
            if(area%i==0){
                int q = area/i;
                int diff = Math.abs(i-q);
                if(max>diff){
                    max = diff;
                    one = i;
                    two = q;
                }
            }
        }
        int arr[] = new int[2];
        arr[0] = two;
        arr[1] = one;
       // Arrays.sort(arr);
        return arr;
    }
}
