class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        j=0
        for i in range(0,len(nums)):
            if(nums[i]!=0):
                t = nums[i]
                nums[i] = nums[j]
                nums[j] = t
                j = j+1
        
