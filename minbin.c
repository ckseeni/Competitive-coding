#include<stdio.h>//to print 32 AS 11,11,10
void stackform(int *stack,int count,int *top){
	int i,k,range=1,num,r,result,ten=1;
	for(k=1;k<=count;k++)
		range=range*2;
	for(i=0;i<range;i++){
		num=i;
		while(num!=0){
			r=num%2;
			num=num/2;
			result=result+r*ten;
			ten=ten*10;
		}
		stack[i]=result;
		result=0;
		ten=1;	
	}	
	*top=i-1;
}
void min(int *stack,int num,int top){
	int i=top,q,r;	
	while(num!=0){
		r=num%stack[i];
		q=num/stack[i];	
		while(q!=0){
			printf("\n%d",stack[i]);
			q--;
		}
		num=r;
		i--;
	}	
}
int main(){
	int num,stack[100],top,num1,count=0,i;
	printf("\nEnter num:");
	scanf("%d",&num);
	num1=num;
	while(num!=0){
		num=num/10;
		count++;
	}
	stackform(stack,count,&top);
	min(stack,num1,top);
	return 0;
}
