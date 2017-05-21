public class Solution {
    public int nextGreaterElement(int n) {
        char arr[] = (n+"").toCharArray();
        for(int i = arr.length-2;i>=0;i--){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i])
                    min = j;
            }
            if(min!=i){
                char t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
                Arrays.sort(arr,i+1,arr.length);
                long val = Long.parseLong(new String(arr));
                if(val>Integer.MAX_VALUE)
                    return -1;
                else
                    return (int)val;
            }
        }
        return -1;
    }
}
556. Next Greater Element III

    User Accepted: 560
    User Tried: 791
    Total Accepted: 574
    Total Submissions: 2493
    Difficulty: Medium

Given a positive 32-bit integer n, you need to find the smallest 32-bit integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive 32-bit integer exists, you need to return -1.

Example 1:

Input: 12
Output: 21

Example 2:

Input: 21
Output: -1

