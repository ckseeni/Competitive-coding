import sys
giv=[]
hashlist=[]
n=0

def initialize():
	global giv,hashlist,n
	n=input("Enter n:")
	for i in range(0,n):
		giv.append(input("->"))
		hashlist.append(0)
	hashlist.append(0)

def hashadd():
	global giv,hashlist,n
	for i in range(0,n):
		hashlist[giv[i]-1]=1

def findmiss():
	global hashlist,n
	for i in range(0,n+1):
		if(hashlist[i]!=1):
			print("\nmissing element is %d"%(i+1))
			break;

def main():
	initialize()
	hashadd()
	findmiss()

if __name__=="__main__":
	main()
