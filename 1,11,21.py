import sys
n=int(raw_input("\nEnter n:"))
a=[]
temp=[]
count=1
a.append(1)
print(a[0])
a.append(-1)
for i in range(0,n-1):
	for j in range(0,len(a)-1):	
		if a[j]==a[j+1]:
			count=count+1
		else:
			temp.append(count)
			temp.append(a[j])
			count=1			
	count=1
	a=temp
	a.append(-1)
	temp=[]
	print("\n")
	for k in range(0,len(a)-1):
		sys.stdout.write("%d"%a[k]);
