public class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<=0)
            return false;
       int max = 1162261467;//3^19
       int r = max%n;
       if(r==0)
            return true;
        return false;
    }
}
