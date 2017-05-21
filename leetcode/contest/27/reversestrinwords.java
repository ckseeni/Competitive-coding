public class Solution {
    public String reverseWords(String s) {
        String arr[]  = s.split(" ");
        StringBuilder res = new StringBuilder();
        int i=0;
        for(int j=0;j<arr.length;j++){
            for(int k=arr[j].length()-1;k>=0;k--)
                res.append(arr[j].charAt(k));
            if(j!=arr.length-1)
                res.append(" ");
        }
        return res.toString();
    }
}
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

