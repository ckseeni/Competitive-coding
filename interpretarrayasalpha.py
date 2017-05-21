import sys
def processone(givarr,basearr):
	for i in range(0,len(givarr)):
		sys.stdout.write("%c"%basearr[int(givarr[i])])
def processtwo(givarr,basearr):
	for i in range(0,len(givarr)-1):
		j=i+1
		#s=int(givarr[i])*10+int(givarr[j])    it is an another way of combining 2 elements
		s=int(givarr[i]+givarr[j])  #it is a way of concatenation
		for k in range(0,i):
			sys.stdout.write("%c"%basearr[int(givarr[k])])
		if(s<=26):
			sys.stdout.write("%c"%basearr[s])
		for l in range(j+1,len(givarr)):
			sys.stdout.write("%c"%basearr[int(givarr[l])])	
		print("\n")
def main():
	givarr=[]
	basearr=['','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',]
	string=raw_input("Enter array elements separated by spaces:")
	givarr=string.split(" ")
	#print(givarr)
	processone(givarr,basearr)
	print("\n")
	processtwo(givarr,basearr)
if __name__=="__main__":
	main()
