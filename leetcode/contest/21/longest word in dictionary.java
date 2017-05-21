524. Longest Word in Dictionary through Deleting

    User Accepted: 609
    User Tried: 827
    Total Accepted: 619
    Total Submissions: 2039
    Difficulty: Medium

Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:

Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output: 
"apple"

Example 2:

Input:
s = "abpcplea", d = ["a","b","c"]

Output: 
"a"

Note:

    All the strings in the input will only contain lower-case letters.
    The size of the dictionary won't exceed 1,000.
    The length of all the strings in the input won't exceed 1,000.

We sort the input dictionary by longest length and lexicography. Then, we iterate through the dictionary exactly once. In the process, the first dictionary word in the sorted dictionary which appears as a subsequence in the input string s must be the desired solution.

public String findLongestWord(String s, List<String> d) {
    Collections.sort(d, (a,b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) :  a.compareTo(b));
    for (String dictWord : d) {
        int i = 0;
        for (char c : s.toCharArray()) 
            if (i < dictWord.length() && c == dictWord.charAt(i)) i++;
        if (i == dictWord.length()) return dictWord;
    }
    return "";
}
//public class Solution {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,(a,b) -> a.length()!=b.length() ? -Integer.compare(a.length(),b.length()) : a.compareTo(b));
        for(String dict : d){
            int i=0;
            for(char c : s.toCharArray()){
                if(i<dict.length()&&c==dict.charAt(i))
                    i++;
            }
            if(i==dict.length())
                return dict;
        }
        return "";
    }
}//
