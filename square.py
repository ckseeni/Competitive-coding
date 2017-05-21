a=[]
d1=[]
d2=[]
d=[]
u=[]
cou=[]
k=0
def calc(x):
	global k
	global a
	y=0
	if x==0:
		x1=a[0]
		x2=a[1]
	if x==2:
		x1=a[2]
		x2=a[3]
	if x==4:
		x1=a[4]
		x2=a[5]
	if x==6:
		x1=a[6]
		x2=a[7]
	for i in range(0,4):
		z1=abs(x1-a[y])
		d1.append(z1)
		z2=abs(x2-a[y+1])
		d2.append(z2)
		d.append((z1*z1)+(z2*z2))
		y=y+2

	
def check(x):
	f=0
	if u:
		for i in u:
			if i==x:
				f=1	
		if f==0:
			u.append(x)
	else:
		u.append(x)
def check1():
	length=len(u)
	if length!=3:
		print "\nNot a square"
		exit(0)
	else:
		for i in u:
			check2(i)
def check2(x):
	c=0
	for i in d:
		if x==i:
			c=c+1
	cou.append(c)	

print("\nEnter coordinates one by one:")
for i in range(0,8):
	x=input("\n")
	a.append(x)
calc(0)
calc(2)
calc(4)
calc(6)
for i in d:
	check(i)
check1()

f=1
for i in cou:
	if i!=4 and i!=8:
		f=0
	if f==0:
		print "\nNot a square"
if f==1:
	print "\nSquare"			

