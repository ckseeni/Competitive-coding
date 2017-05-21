#include<stdio.h>

int main(){
	long count=0,i,j,k,l=2,sum=0;
	long p[1000],N;
	p[0]=2;p[1]=3;
	printf("\nEnter N:");
	scanf("%lu",&N);
	for(i=5;i<=N;i++){
		j=i/2;
		for(k=2;k<=j;k++){
			if(i%k==0)
				break;
		}
		if(k>j){
			p[l]=i;
			l++;
		}
	}
	for(i=2;i<l;i++){
		j=0;
		sum=0;
		while(j<=i-1){
			sum=sum+p[j];
			j++;
			if(sum==p[i]){
				count++;
				break;
			}	
		}
	}
	printf("\noutput is %lu\n",count);
	return 0;
}
