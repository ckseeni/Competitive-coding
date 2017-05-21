public class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                i++;
                while(i<s.length()&&s.charAt(i)==' ')
                    i++;
                c++;
            }
        } 
        return c+1;
    }
}
