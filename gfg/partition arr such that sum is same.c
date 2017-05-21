#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
//partition elements in the array as two part such that their sum is equal
int main(){
	int n;
	scanf("%d",&n);
	int *arr;
	arr = (int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]>arr[j]){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
	}
	int tsum = 0;
	for(int i=0;i<n;i++)
		tsum = tsum + arr[i];
	int psum = 0;
	for(int i=0;i<n-1;i++){
		psum = psum + arr[i];
		tsum = tsum - arr[i];	
		if(psum==tsum){
			printf("\nYES");
			return 0;
		}
		for(int j=i+1;j<n;j++){
			if(psum + arr[j]==tsum - arr[j]){
				printf("\nYES");
				return 0;
			}
		}
	}
	printf("\nNO");
	return 0;
}
