import sys
n = input()
arr = map(int, raw_input().split())
for i in range(0,n/2):
	if(i%2==0):
		t = arr[i]
		arr[i] = arr[n-i-1]
		arr[n-i-1] = t
for i in range(0,n):
	sys.stdout.write("%d "%arr[i])
