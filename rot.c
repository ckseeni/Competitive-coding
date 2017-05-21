#include<stdio.h>
void dis(int result[100][100],int n){
	int i,j;
	printf("\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++)
			printf("  %d  ",result[i][j]);
		printf("\n");
	}
	printf("\n");
}
void rotate(int matrix[100][100],int result[100][100],int n){
	int prev,i,j,curr,c=0,cp=n;
	while(c<=(cp/2)-1){
		i=c;
		j=c;
		prev=matrix[i+1][j];
		for(i=c;j<n;j++){
			curr=matrix[i][j];
			matrix[i][j]=prev;
			prev=curr;
			dis(matrix,n+c);
		}
		j--;
		for(i=c+1;i<n;i++){
			curr=matrix[i][j];
			matrix[i][j]=prev;
			prev=curr;
			dis(matrix,n+c);
		}
		i--;
		j--;
		for(;j>=c;j--){
			curr=matrix[i][j];
			matrix[i][j]=prev;
			prev=curr;
			dis(matrix,n+c);
		}
		i--;
		j++;
		for(;i>=c+1;i--){
			curr=matrix[i][j];
			matrix[i][j]=prev;
			prev=curr;
			dis(matrix,n+c);
		}
		c++;
		n--;
	}
}
int main(){
	int matrix[100][100],result[100][100],n,i,j;
	printf("\nEnter N:");
	scanf("%d",&n);
	printf("\nEnter elements:");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&matrix[i][j]);
			result[i][j]=matrix[i][j];
		}
	}
	rotate(matrix,result,n);
	dis(result,n);	
	dis(matrix,n);
	return 0;
}
