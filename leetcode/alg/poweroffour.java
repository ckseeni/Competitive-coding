public class Solution {
    public boolean isPowerOfFour(int num) {
    if(num<=0)
        return false;
    String s = Integer.toString(num,2);
    int c = 0,d=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1')
            c++;
        else
            d++;
    }
    if(c==1&&d==s.length()-1&&d%2==0)
        return true;
    return false;
    }
}
