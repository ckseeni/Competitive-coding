'''
# Read input from stdin and provide input before running code

name = raw_input()
print 'Hi, %s.' % name
'''
n = input()
res = 1
arr = map(long,raw_input().split())
for i in range(0,n):
	res = res * arr[i]
p =1/float(n)
rt = float(pow(res,p))
r = int(rt)
r1 = rt
if(r!=r1):
    r = r + 1
print r

