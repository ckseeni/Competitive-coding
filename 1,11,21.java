public class Solution {
    public String countAndSay(int n) {
        String s = new String("1");
        for(int i=0;i<n-1;i++){
            StringBuffer buf = new StringBuffer();
            for(int j=0;j<s.length();j++){
                int c = 1;
                while(j<s.length()-1&&s.charAt(j)==s.charAt(j+1)){
                    c++;
                    j++;
                }
                buf.append(c);
                buf.append(s.charAt(j));
            }
            s = buf.toString();
        }
        return s;
    }
}
