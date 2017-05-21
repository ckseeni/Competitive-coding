import sys
n = input()
arr = map(int,raw_input().split())
maximum = 1
minimum = 1000000000
for i in range(0,n):
	x = arr[i]
	if(maximum<arr[i]):
		maximum = arr[i]
	if(minimum>arr[i]):
		minimum = arr[i]
c = 0
for i in range(0,n):
	x = arr[i]
	if(arr[i]<maximum and arr[i]>minimum):
		c = c+1
sys.stdout.write("%d"%c)
