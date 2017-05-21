#include<stdio.h>
void recs(int a){	
	if(a==0)
		return;		
	a--;
	printf(" ");
	recs(a);
}

void recst(int a){
	printf("*");	
	if(a==0)
		return;		
	a--;
	recst(a);	
}

void main(){
	int i,j,k,N,c=2,spacecount;
	printf("\nEnter N");
	scanf("%d",&N);
	spacecount=(((2*N)-1)/2)+1;
	for(i=0;i<(2*N);i++){
		if(i<N){
			spacecount=spacecount-1;
			recs(spacecount);
			recst(2*i);
			printf("\n");
			
		}
		else{
			spacecount=spacecount+1;
			recs(spacecount);
			//for(j=0;j<=((2*i)-(2*c));j++)
			//	printf("*");
			recst((2*i)-(c*2));
			printf("\n");
			c=c+2;
		}
	}
}
