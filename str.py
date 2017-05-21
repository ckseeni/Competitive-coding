str1=raw_input("\nEnter str1:")
str2=raw_input("\nEnter str2:")
str3=''
f=0
len1=len(str1)
len2=len(str2)
for i in range(0,len1):
	for j in range(0,len2):
		if str1[i]==str2[j]:
			f=1
	if f==1:		
		str3+=' '
	elif f==0:
		str3+=str1[i]
	f=0

print str3
