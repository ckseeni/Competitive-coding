"""The basic idea is that we iterate through the input array and mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1]. In this way all the numbers that we have seen will be marked as negative. In the second iteration, if a value is not marked as negative, it implies we have never seen that index before, so just add it to the return list."""

class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        for i in range(0,len(nums)):
            ind = abs(nums[i]) - 1
            if(nums[ind]>0):
                nums[ind] = - nums[ind]
        res=[]
        for i in range(0,len(nums)):
            if(nums[i]>0):
                res.append(i+1);
        return res
        
