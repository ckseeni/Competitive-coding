#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
int main(){
	int n;
	scanf("%d",&n);
	int arr[n];
	int c = 0,max = 0;
	for(int i=0;i<n;i++)
		arr[i] = 0;
	for(int i=0;i<2*n;i++){
		int e;
		scanf("%d",&e);
		if(arr[e-1]==0){
			c++;
			arr[e-1]=1;
		}
		else{
			c--;
			arr[e-1] = 0;
		}
		if(max<c)
			max = c;
	}
	printf("%d",max);
	return 0;
}
