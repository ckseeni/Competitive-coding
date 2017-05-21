#include<stdio.h>
#include<math.h>
int main(){
	int s;
	scanf("%d",&s);
	int arr[s];
	for(int i=0;i<s;i++)
		scanf("%d",&arr[i]);
	for(int i=0;i<s-1;i++){
		for(int j=i+1;j<s;j++){
			if(arr[i]>arr[j]){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j]= t;
			}				
		}
	}
	int diff[s-1];
	for(int i=0;i<s-1;i++)
		diff[i] = arr[i+1]-arr[i];
	int min = 1000000,ind = -1;
	for(int i=0;i<s-1;i++){
		if(min>diff[i]){
			min = diff[i];
			ind = i;
		}
	}
	printf("%d %d",arr[ind],arr[ind+1]);
	return 0;
}
