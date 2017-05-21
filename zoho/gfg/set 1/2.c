#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int sq(int x){
	for(int i=1;i<=x/2;i++){
		if(i*i==x)
			return 1;
	}
	return 0;
}
int main(){
	int *arr,*weight;
	int n;
	printf("\nEnter length");
	scanf("%d",&n);
	arr = (int *)malloc(n*sizeof(int));
	weight = (int *)malloc(n*sizeof(int));
	printf("\nEnter elements:");
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
	for(int i=0;i<n;i++){
		if(sq(arr[i]))
			weight[i] = weight[i] + 5;
		if(arr[i]%4==0&&arr[i]%6==0)	
			weight[i] = weight[i] + 4;
		if(arr[i]%2==0)
			weight[i] = weight[i] + 3;
	}
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(weight[i]>weight[j]){
				int t = weight[i];
				weight[i] = weight[j];
				weight[j] = t;
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
	}
	printf("\n");
	for(int i=0;i<n-1;i++)
		printf("<%d,%d>,",arr[i],weight[i]);
	printf("<%d,%d>",arr[n-1],weight[n-1]);
	return 0;
}
/*. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order*/

