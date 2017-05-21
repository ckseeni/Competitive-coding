public class Solution {
    public int hammingDistance(int x, int y) {
        String x1 = Integer.toString(x,2);
        String y1 = Integer.toString(y,2);
        if(x1.length()<y1.length()){
            int diff = y1.length()-x1.length();
            StringBuffer b = new StringBuffer();
            for(int i=0;i<diff;i++)
                b.append("0");
            b.append(x1);
            x1 = b.toString();
        }
        else if(x1.length()>y1.length()){
             int diff = x1.length()-y1.length();
            StringBuffer b = new StringBuffer();
            for(int i=0;i<diff;i++)
                b.append("0");
            b.append(y1);
            y1 = b.toString();    
        }
        int d = 0;
        for(int i=0;i<x1.length();i++){
            if(x1.charAt(i)!=y1.charAt(i))
                d++;
        }
        return d;
    }
}
