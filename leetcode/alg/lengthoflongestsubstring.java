public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0,max=0;
        for(int i=0;i<s.length();){
            int j=i;
            ArrayList<Character> a = new ArrayList<Character>();
            a.add(s.charAt(i));
            length=0;
            length++;
            i++;
            while(i<s.length()&&!a.contains(s.charAt(i))){
                length++;
                a.add(s.charAt(i));
                i++;
            }
            max = Math.max(length,max);
            if(length>max)
                j=i+length;
            a.clear();
            i=j;
            i++;
        }
        return max;
    }
}
