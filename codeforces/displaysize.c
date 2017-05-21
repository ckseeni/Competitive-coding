#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main(){
	int n,s;
	scanf("%d",&n);
	double n1 = (double)n;
	s = (int)sqrt(n1);
	if(s*s==n)
		printf("%d %d",s,s);
	else{
		int arr[n];
		int k=0;
		arr[0]=1;
		k++;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				arr[k++]=i;
		}	
		arr[k++] = n;
		int mid = k/2;
		printf("%d %d",arr[mid-1],arr[mid]);
	}
	return 0;
}
