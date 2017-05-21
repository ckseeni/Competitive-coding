public class Solution {
    public int trailingZeroes(int n) {
        int r = 0;
        int q = n/5;
        r =r +q;
        n=q;
        while(n>=5){
            q = n/5;
            n=q;
            r = r+q;
        } 
        return r;
    }
}
