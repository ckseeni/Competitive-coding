public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length<3)
            return 0;
        int c = 2,tot=0;
        int prevdiff = A[0]-A[1];
        for(int i=1;i<A.length-1;i++){
            int diff = A[i]-A[i+1];
            if(diff==prevdiff)
                c++;
            else{
                if(c>=3){
                    int n = c-2;
                    int sum = (n*(n+1))/2;
                    tot= tot + sum;
                }
                c=2;
                prevdiff = diff;
            }
        }
        if(c>=3){
            int n = c-2;
            int sum = (n*(n+1))/2;
            tot= tot + sum;
        }
        return tot;
    }
}
