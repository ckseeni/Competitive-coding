#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main(){
	int n;
	scanf("%d",&n);
	int *arr;
	arr = (int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
	int maxsum = arr[0],currsum = arr[0];
	for(int i=1;i<n;i++){
		if(arr[i]>currsum + arr[i])
			currsum = arr[i];
		else
			currsum = currsum + arr[i];
		if(maxsum<currsum)
			maxsum = currsum;
		printf("\n%d    %d",maxsum,currsum);
	}
	printf("\n%d",maxsum);
	return 0;
}
