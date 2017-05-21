					//run time:1:17
#include<stdio.h>
#define size 1000
int matrix[size][size];
void queenpathset(int i, int j,int N,int queen){
	int k,l;
	for(k=i,l=j-1;l>=0;l--){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i,l=j+1;l<N;l++){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i-1,l=j;k>=0;k--){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i+1,l=j;k<N;k++){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i+1,l=j+1;k<N&&l<N;k++,l++){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i-1,l=j+1;k>=0&&l<N;k--,l++){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
	for(k=i+1,l=j-1;k<N&&l>=0;k++,l--){
		if(matrix[k][l]==0)
			matrix[k][l]=queen;
	}	
}
void queenpathreset(int i, int j,int N,int queen){
	int k,l;
	matrix[i][j]=0;
	for(k=i,l=j-1;l>=0;l--){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}
	for(k=i,l=j+1;l<N;l++){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}
	for(k=i-1,l=j;k>=0;k--){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}	
	for(k=i+1,l=j;k<N;k++){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}
	for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}	
	for(k=i+1,l=j+1;k<N&&l<N;k++,l++){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}	
	for(k=i-1,l=j+1;k>=0&&l<N;k--,l++){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}	
	for(k=i+1,l=j-1;k<N&&l>=0;k++,l--){
		if(matrix[k][l]==queen)
			matrix[k][l]=0;
	}	
}
int main(){
	int i,j,N,k,ej=0,ei=0,prevj,queen=0,count=0;
	printf("\nEnter N:");
	scanf("%d",&N);
	j=0;
	i=N-1;
	while(ei!=N){
	for(;i>=0;){
		for(;j<N;){
			if(matrix[i][j]==0){
				matrix[i][j]=82;
				queen++;
				queenpathset(i,j,N,queen);				
				break;
			}
			j++;
		}	
		if(j==N){
			for(k=0;k<N;k++){
				if(matrix[i+1][k]==82){
					prevj=k;
					break;
				}
			}
			queenpathreset(i+1,prevj,N,queen);
			queen--;
			i++;
			j=prevj+1;
			if(i==N&&j==N)
				break;
		}
		else{
			i--;
			j=0;
		}	
	}
	if(i==N&&j==N)
		break;
	count++;
	printf("\nsolution %d:\n",count);
	for(i=0;i<N;i++){
		for(j=0;j<N;j++){
			if(matrix[i][j]==82)
				printf("%c  ",matrix[i][j]);
			else printf("%d  ",0);
		}
		printf("\n");
	}
	for(k=0;k<N;k++){
		if(matrix[ei][k]==82){
			ej=k;
			i=ei;
			break;
		}
	}
	if(k==N){
		ei++;
		for(k=0;k<N;k++){
		if(matrix[ei][k]==82){
			ej=k;
			i=ei;
			break;
		}
	}
	}
	queenpathreset(i,k,N,queen);
	queen--;
	j=ej+1;
	}	
	return 0;
}
