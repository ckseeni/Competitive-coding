#include<stdio.h>
#define N 200
int flag[N][N],build[N][N];
int matrix[N][N];
int count=1;
void dfs(int row, int col, int i, int j){
	if(flag[i][j]==1){
		flag[i][j]=0;
		build[i][j]=count;
		if(matrix[i][j+1]==1||matrix[i][j+1]==5)	
			dfs(row,col,i,j+1);
		if(j-1>=0){
			if(matrix[i][j-1]==1||matrix[i][j-1]==5)
				dfs(row,col,i,j-1);
		}
		if(i-1>=0){
			if(matrix[i-1][j]==1||matrix[i-1][j]==5)
				dfs(row,col,i,j);
		}	
		if(matrix[i+1][j]==1||matrix[i+1][j]==5)
			dfs(row,col,i+1,j);
		if((i-1)>=0&&(j-1)>=0){
			if(matrix[i-1][j-1]==1||matrix[i-1][j-1]==5)
				dfs(row,col,i-1,j-1);
		}	
		if((i-1)>=0){
			if(matrix[i-1][j+1]==1||matrix[i-1][j+1]==5)
				dfs(row,col,i-1,j+1);
		}	
		if((j-1)>=0){
			if(matrix[i+1][j-1]==1||matrix[i+1][j-1]==5)
				dfs(row,col,i+1,j-1);
		}
		if(matrix[i+1][j+1]==1||matrix[i+1][j+1]==5)
			dfs(row,col,i+1,j+1);
		}
}

int main(){
	FILE *fp;
	char c;
	int i=0,j=0,row=0,col=0,dec;
	char str[10]="build.txt";
	fp = fopen(str,"r");
	while((c=getc(fp))!=EOF){	
		if(c=='#'){
			matrix[i][j]=1;
			flag[i][j]=1;
			j++;
			if(j>col)
				col=j;	
		}	
		else if(c=='$'){
			matrix[i][j]=5;
			flag[i][j]=1;
			j++;
			if(j>col)
				col=j;
		}
		else if(c==' '){
			matrix[i][j]=0;
			j++;
			if(j>col)
				col=j;
		}
		else if(c=='\n'){
			i++;
			j=0;
			if(i>row)
				row=i;
		}
	}

	for(i=0;i<row;i++){
		for(j=0;j<col;j++){
			if(flag[i][j]==1){
				dfs(row,col,i,j);
				count++;			
			}	
		}
	}
	for(i=0;i<row;i++){
		for(j=0;j<col;j++){
			if(matrix[i][j]==5){
				printf("\n");
				dec=j;
				while(build[i][dec]!=0){
					dec--;	
				}
				dec=j-dec;
				printf("%d%d%d",build[i][j],row-i,dec);	
				printf("\n");	
			}	
		}
	}
	
	return 0;
}
