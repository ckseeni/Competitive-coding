#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
//longest increasing subsequence
int max(int a,int b){
	if(a>b)
		return a;
	else
		return b;
}
int main(){
	int n;
	scanf("%d",&n);
	int *arr;
	arr = (int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
	int *count;
	count = (int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		count[i] = 1;
	for(int i=0;i<n;i++){
		for(int j=i-1;j>=0;j--){
			if(arr[i]>arr[j])
				count[i] = max(count[i],count[j]+1);	
			/*for(int i=0;i<n;i++)
				printf("%d ",count[i]);
			printf("\n");*/	
		}
	}
	int max = 0;
	for(int i=0;i<n;i++){
		if(max<count[i])
			max = count[i];
	}
	printf("\n%d",max);
	return 0;
}
