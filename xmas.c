#include<stdio.h>
void draw(int i,int N,int spacecount){
	int j,k;
	for(;i<N;i++){
		for(k=0;k<spacecount;k++)
			printf(" ");
		for(j=0;j<=(2*i);j++)
			printf("*");
		printf("\n");
		spacecount=spacecount-1;
	}
}
int main(){
	int N,k,spacecount,i=0;
	printf("\nEnter N:");
	scanf("%d",&N);
	spacecount=(((2*N)-1)/2);
	draw(0,N,spacecount);
	spacecount=(((2*N)-1)/2)-1;
	draw(1,N,spacecount);
	draw(1,N-1,spacecount);
	spacecount=(((2*N)-1)/2);
	while(i<2){
	for(k=0;k<spacecount;k++)
			printf(" ");
	printf("*\n");
	i++;
	}
	return 0;
	
}
