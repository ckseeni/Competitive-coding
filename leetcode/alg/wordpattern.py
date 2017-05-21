class Solution(object):
    def wordPattern(self, s, t):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        t = t.split()
        arr={}
        set1 = set()
        l1 = len(s)
        l2 = len(t)
        if(l1 != l2):
            return False
        for i in range(0,len(s)):
        	if(arr.has_key(s[i])):
        		if(arr[s[i]]!=t[i]):
        			return False		
        	else:
        		if i<len(t) and t[i] not in set1:
        			arr1={s[i]:t[i]}
        			arr.update(arr1)
        			set1.add(t[i])
        		else:
        			return False
        return True        		
        
        
