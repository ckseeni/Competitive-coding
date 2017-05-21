#include<stdio.h>

int main(){
	int N,value=1,i;
	printf("\nenter N:");
	scanf("%d",&N);
	for(i=1;value<N;i++){
		value=value*5;
	}
		
	if(value==N)
		printf("\nThe number can be represented in 5^n format: for current number: 5^%d\n",i-1);
	else if(value>N)
		printf("\nThe number cant be represented in 5^n format!");
	return 0;
}
