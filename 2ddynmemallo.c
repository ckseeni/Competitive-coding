#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
	int **arr;
	arr = (int **)malloc(2*sizeof(int *));
	for(int i=0;i<2;i++){
		arr[i] = (int *)malloc(2*sizeof(int));
		for(int j=0;j<2;j++)
			printf("%d ",arr[i][j]);
		printf("\n");
	}
	return 0;
}

