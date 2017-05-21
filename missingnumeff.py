giv=[]
n=0

def initialize():
	global giv,n
	n=input("\nEnter n:")
	print("\nEnter elements:")
	for i in range(0,n):
		giv.append(input("->"))

def findmiss():
	global giv,n
	sum=((n+1)*(n+2))/2
	for i in range(0,n):
		sum=sum-giv[i]
	print("\nMissing num is %d"%sum)

def main():
	initialize()
	findmiss()
if __name__=="__main__":
	main()
