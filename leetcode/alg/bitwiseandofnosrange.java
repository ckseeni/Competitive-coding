public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        while(n>m){
            int and = n&n-1;
            n = and;
        }    
        return n&m;
    }
}
