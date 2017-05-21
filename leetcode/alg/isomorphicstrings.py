s="abab"
t="baba"
arr={}
set1 = set()
for i in range(0,len(s)):
	if(arr.has_key(s[i])):
		if(arr[s[i]]!=t[i]):
			print("wrong @"+ v)		
	else:
		if t[i] not in set1:
			arr1={s[i]:t[i]}
			arr.update(arr1)
			set1.add(t[i])
		else:
			print("wrong @"+ t[i])
        		
print(set1)
print(arr)
        
