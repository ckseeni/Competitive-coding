class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res=[]
        for i in range(0,len(nums)):
            ind = abs(nums[i]) - 1
            if(nums[ind]>0):
                nums[ind] = - nums[ind]
            elif(nums[ind]<0):
                res.append(ind+1)
        return res
