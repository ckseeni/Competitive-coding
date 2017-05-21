#include<stdio.h>
void main(){
	int i,j,k,N,c=2,spacecount;
	printf("\nEnter N");
	scanf("%d",&N);
	spacecount=(((2*N)-1)/2)+1;
	for(i=0;i<(2*N);i++){
		if(i<N){
			spacecount=spacecount-1;
			for(k=0;k<spacecount;k++)
				printf(" ");
			for(j=0;j<=(2*i);j++)
				printf("*");
			printf("\n");
			
		}
		else{
			spacecount=spacecount+1;
			for(k=0;k<spacecount;k++)
				printf(" ");
			for(j=0;j<=((2*i)-(2*c));j++)
				printf("*");
			printf("\n");
			c=c+2;
		}
	}
}
