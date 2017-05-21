#include<stdio.h>
#include<stdlib.h>
//input num as array and process it as array and find sum and print result
int max(int x,int y){
	if(x>y)
		return x;
	else
		return y;
}

int main(){
	int *arr1,*arr2,n1,n2,maxvalue,j,k,*result,carry = 0,sum = 0,r = 0,c;
	printf("\nEnter digit 1:");
	scanf("%d",&n1);
	arr1 =(int *) calloc(n1,sizeof(int));
	for(int i=0;i<n1;i++)
		scanf("%d",&arr1[i]);
	printf("\nEnter digit 2:");
	scanf("%d",&n2);
	arr2 =(int *) calloc(n2,sizeof(int));
	for(int i=0;i<n2;i++)
		scanf("%d",&arr2[i]);
	maxvalue = max(n1,n2);
	c = maxvalue+1-1;
	result = (int *)calloc(maxvalue+1,sizeof(int));
	for(j=n1-1,k=n2-1;j>=0&&k>=0;j--,k--,c--){
		//printf("arr1%d arr2%d",arr1[j],arr2[k]);
		sum = carry+arr1[j]+arr2[k];	
		r = sum % 10;
		result[c] = r;
		carry = sum/10;
	}
	if(j==-1){
		while(k>=0){
			sum = carry + arr2[k];
			r = sum % 10;
			result[c] = r;
			carry = sum/10;
			c--;
			k--;
		}
		result[c]=carry;
	}
	if(k==-1){
		while(j>=0){
			sum = carry + arr1[j];
			r = sum % 10;
			result[c] = r;
			carry = sum/10;
			c--;
			j--;
		}
		result[c]=carry;
	}
	if(result[0]!=0)
		printf("%d ",result[0]);
	for(j=1;j<maxvalue+1;j++)
		printf("%d ",result[j]);
	return 0;
}
