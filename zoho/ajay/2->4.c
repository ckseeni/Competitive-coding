#include<stdio.h>

int main(){
	int s,k;
	scanf("%d%d",&s,&k);
	int arr[s];
	for(int i=0;i<s;i++)
		scanf("%d",&arr[i]);
	for(int i=0;i<=s-k;i++){
		int max = -1;
		for(int j=i;j<i+k;j++){
			if(arr[j]>max)
				max = arr[j];
		}
		printf("%d",max);
	}
	return 0;
}
