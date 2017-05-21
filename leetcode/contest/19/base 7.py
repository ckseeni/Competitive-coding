class Solution(object):
    def convertTo7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if(num==0):
            return "0"
        str1 = ''
        n = 0
        if(num<0):
            num = -num
            n = 1
        while(num!=0):
            r = num%7
            str1 = str1 + str(r)
            num = num / 7
            #print(num)
        s = str1[::-1]
        if(n==1):
            s = "-"+s
        return s
"""Given an integer, return its base 7 string representation.

Example 1:

Input: 100
Output: "202"

Example 2:

Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7]. """
