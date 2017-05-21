class datestr(object):
	def set(self,date,month,year):
		self.date=date
		self.month=month
		self.year=year
	def dis(self):
		print("%d-%d-%d"%(self.date,self.month,self.year))

def main():
	datelist=[]
	arr=[]
	print("\nEnter dates in format DD-MM-YYYY -1 to terminate")
	while 1:
		string=raw_input("->")
		datelist=string.split('-')
		if datelist[0]=='':
			break;
		if int(datelist[0])>31:
			print("\nEnter date in crt format")
		if int(datelist[1])>12:
			print("\nEnter month in crt format")
		if int(datelist[0])>29 and int(datelist[1])==2:
			print("\nEnter feb month date in crt format")
		x=datestr()
		x.set(int(datelist[0]),int(datelist[1]),int(datelist[2]))
		arr.append(x)	
	for i in range(0,len(arr)):
		print(arr[i].dis())	

if __name__=="__main__":
	main()
