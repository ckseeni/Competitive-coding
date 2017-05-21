#include<stdio.h>

void funforseries(int* ser,int N){
	int i,d;	
	ser[0]=6;
	ser[1]=28;
	for(i=2;i<N;i++){
		d=ser[i-1]-ser[i-2];
		ser[i]=ser[i-1]+d+16;
	}
}

int main(){
	int series[100],N,i,j,sum=0,count=0,spacecount,k;
	float space=2.0;
	char ans[14];
	printf("\nEnter N:");
	scanf("%d",&N);
	for(i=1;i<=N;i++)
		sum+=i;
	funforseries(series,sum);
	for(i=1;i<=N;i++){
		spacecount=(int)((N*5)+5)/space;
		space=space+0.5;
		for(k=0;k<spacecount;k++)
			printf(" ");
		for(j=1;j<=i;j++){
			printf("%05d ",series[count]);
			count++;
		}
		printf("\n");
	}
}
