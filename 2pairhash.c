#include<stdio.h>
struct Node{
	int a;
	int b;
	int marker;
};
int findpair(struct Node *hash,int sum,int data1,int data2,int *first,int *second){
	if(hash[sum].marker==0){
		hash[sum].marker=1;
		hash[sum].a=data1;
		hash[sum].b=data2;
		return 0;
	}
	if(hash[sum].marker==1){
		*first=hash[sum].a;
		*second=hash[sum].b;
		hash[sum].marker=0;
		return 1;
	}
}
int main(){
	int array[100],i,n=0,data,j,sum,first,second,count=1;
	char a;
	struct Node *hash=NULL;
	hash=(struct Node *)calloc(100,sizeof(struct Node));
	printf("\nEnter array;");
	for(i=0;a!='\n';i++){
		scanf("%d%c",&data,&a);
		array[i]=data;
		n++;
	}
	n=n-1;
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			sum=array[i]+array[j];
			if(findpair(hash,sum,array[i],array[j],&first,&second))
				printf("\npair %d is (%d,%d),(%d,%d)",count++,array[i],array[j],first,second);
		}
	}
	return 0;
}
