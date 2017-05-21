#this is a program asked in reverse engineering contest, we are required to print pattern 1,1,2,5,14,..
#logic :use dp:n=0->1,n=1->()=1,n=2->(()),()()=2,n=3->((())),()(()),(()()),(())(),()()()
import sys
def main():
	n=int(raw_input("\nEnter n:"))
	a=[]
	a.append(-1)
	a.append(1)
	a.append(1)
	print("\n%d\n%d"%(a[1],a[2]))
	for k in range(2,n):
		s=0
		i=1
		j=len(a)-1
		while j>=1:
			s=s+(a[i]*a[j])
			i=i+1
			j=j-1
		a.append(s)
		sys.stdout.write("\n%d"%s)
					
if __name__=="__main__":
	main()
