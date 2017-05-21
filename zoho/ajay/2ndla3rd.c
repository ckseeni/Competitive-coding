#include<stdio.h>

int main(){
	int s;
	scanf("%d",&s);
	int arr[s];
	for(int i=0;i<s;i++)
		scanf("%d",&arr[i]);
	for(int i=0;i<s-1;i++){
		int max = 1000000;
		for(int j=i+1;j<s;j++){
			if(arr[j]<max&&arr[j]>arr[i])
				max = arr[j];
		}
		if(max==1000000)
			printf("%d ",arr[i]);
		else
			printf("%d ",max);
	}
	printf("%d ",arr[s-1]);
	return 0;
}
