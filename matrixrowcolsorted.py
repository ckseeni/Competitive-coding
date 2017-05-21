import sys
matrix={}
m=0
n=0

def initialize():
	global matrix,m,n
	m=input("\nEnter no of rows")
	n=input("\nEnter no of columns")	
	for i in range(0,m):
		matrix[i]={}
		for j in range(0,n):
			matrix[i][j]=input("\nEnter %d row %d col ele"%(i,j))

def display():
	global matrix,m,n
	for i in range(0,m):
		for j in range(0,n):
			sys.stdout.write("%d  "%matrix[i][j])
			sys.stdout.flush()
		print("\n")

def main():
	global matrix,m,n
	try:
		initialize()
		display()
	except:
		print("\nThere is an error!!!")

if __name__=="__main__":
	main()
