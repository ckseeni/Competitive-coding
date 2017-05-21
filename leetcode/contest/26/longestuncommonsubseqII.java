public class Solution {
    public int subSeq(String s1,String s2){
        int i=0,j=0;
        for(i=0,j=0;i<s1.length()&&j<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        if(j==s2.length())
            return 1;
        return 0;
    }
    public int findLUSlength(String[] strs) {
        if(strs.length==0)
            return -1;
        for(int i=0;i<strs.length-1;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()<strs[j].length()){
                    String t = strs[i];
                    strs[i] = strs[j];
                    strs[j] = t;
                }
            }
        }
        for(int i=0;i<strs.length;i++){
            int f=0;
            for(int j=0;j<strs.length;j++){
                if(i!=j&&subSeq(strs[j],strs[i])==1)
                    f=1;
            }
            if(f==0)
                return strs[i].length();
        }
        return -1;
    }
    
}
 Given a list of strings, you need to find the longest uncommon subsequence among them. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be a list of strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.

Example 1:

Input: "aba", "cdc", "eae"
Output: 3

Note:

    All the given strings' lengths will not exceed 10.
    The length of the given list will be in the range of [2, 50].

