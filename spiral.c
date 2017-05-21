#include<stdio.h>
int matrix[100][100],pmatrix[100][100];
int N;
void display(){
	int i,j;
	for(i=0;i<N;i++){
		for(j=0;j<N;j++){
			printf("%d",pmatrix[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
}
void print(int N, int c){
	int i,j,k;
	for(i=c,j=c,k=0;k<(N-c);j++,k++){
		pmatrix[i][j]=matrix[i][j];
		display();
	}
	for(i=c+1,j=j-1;i<N;i++){
		pmatrix[i][j]=matrix[i][j];
		display();
	}
	for(i=N-1,j=j-1;j>=0;j--){
		pmatrix[i][j]=matrix[i][j];
		display();
	}
	for(i=N-2,j=c;i>=c+1;i--){
		pmatrix[i][j]=matrix[i][j];
		display();
	}	
}
int main(){
	int i,j;
	printf("\nEnter the order for square matrix:");
	scanf("%d",&N);
	for(i=0;i<N;i++){
		for(j=0;j<N;j++){
			printf("\nEnter");
			scanf("%d",&matrix[i][j]);
		}
	}
	for(i=0;i<N;i++){
		for(j=0;j<N;j++){
			pmatrix[i][j]=0;
		}
	}
	for(i=0;i<=(N/2);i++)
		print(N-i,i);
	return 0;
}
