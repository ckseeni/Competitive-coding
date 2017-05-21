import math
n = input();
c=0;
while n!=1:
	f = n/2.0;
	n = math.ceil(f);
	c=c+1;
print(c);
