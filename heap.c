#include<stdio.h>
#define size 100
void insert(int *heap,int data,int i){
	int flag=1,parent=i/2,temp;
	heap[i]=data;
	while(flag){
		if(heap[parent]>heap[i]){	
			temp=heap[parent];
			heap[parent]=heap[i];
			heap[i]=temp;
			i=parent;
			parent=i/2;
		}
		else
			flag=0;
	}
}
void display(int *heap,int i){
	int j;
	for(j=1;j<=i;j++)
		printf("\n%d",heap[j]);
}
void remo(int *heap,int *n){
	int i=1,left,right,flag=1,parent,temp;
	printf("\nmin element is %d",heap[i]);
	heap[i]=heap[*n-1];
	*n=*n-1;
	parent=i;
	left=2*i;
	right=(2*i)+1;
	while(left<=*n){
		if(heap[parent]<heap[left]&&heap[parent]<heap[right])
			return;
		if(heap[right]>heap[left]){
			temp=heap[left];
			heap[left]=heap[parent];
			heap[parent]=temp;
			parent=left;
		}
		else{
			temp=heap[right];
			heap[right]=heap[parent];
			heap[parent]=temp;
			parent=right;
		}
		left=2*parent;
		right=2*parent+1;
	}
}
int main(){
	int heap[size],i=1,c,data;
	heap[0]=-1000;
	while(1){
		printf("\n1.insert\n2.remove\n3.display\n4.exit");
		scanf("%d",&c);
		switch(c){
			case 1: printf("\nEnter element:");
					scanf("%d",&data);
					insert(heap,data,i++);
					break;	
			case 2:	remo(heap,&i);
					break;
			case 3: display(heap,i-1);
					break;
			case 4: return 0;
		}
	}
}
