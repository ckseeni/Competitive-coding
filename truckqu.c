#include<stdio.h>
#define size 100
int n;
struct cqueue{
	int petrol[size],distance[size];
	int rear,front;
};
void Enqueue(struct cqueue *q,int petrol,int dis){
	q->petrol[q->rear]=petrol;
	q->distance[q->rear]=dis;
	q->rear++;		
}
int traverse(struct cqueue *q,int start){
	int i,truckpetrol=0,petrol,dis,c=0;
	for(i=start;1;(i++)%n){
		truckpetrol=truckpetrol+q->petrol[i];
		if(c==n)
			return 1;
		else if(truckpetrol>=q->distance[i]){
			truckpetrol=truckpetrol-q->distance[i];
			c=c+1;
		}
		else if(truckpetrol<q->distance[i])		
			return 0;
	}
}
int main(){
	struct cqueue q;
	int i,data,data1;
	q.rear=0;
	q.front=0;
	printf("\nEnter N:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("\nEnter petrol and dis:");
		scanf("%d%d",&data,&data1);
		Enqueue(&q,data,data1);
	}
	for(i=0;i<n;i++){
		if(traverse(&q,i)==1){
			printf("\nstarting pt is %d",i+1);
			break;
		}
	} 
	return 0;
}

