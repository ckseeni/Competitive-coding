#include<stdio.h>
#define N 200
int flag[N][N];
int matrix[N][N];
int islandcount[N],jump=0;
void dfs(int row, int col, int i, int j){
	if(flag[i][j]==1){
		flag[i][j]=0;
		jump++;
		if(matrix[i][j+1]==1)	
			dfs(row,col,i,j+1);
		if(j-1>=0){
			if(matrix[i][j-1]==1)
				dfs(row,col,i,j-1);
		}
		if(i-1>=0){
			if(matrix[i-1][j]==1)
				dfs(row,col,i,j);
		}	
		if(matrix[i+1][j]==1)
			dfs(row,col,i+1,j);
		if((i-1)>=0&&(j-1)>=0){
			if(matrix[i-1][j-1]==1)
				dfs(row,col,i-1,j-1);
		}	
		if((i-1)>=0){
			if(matrix[i-1][j+1]==1)
				dfs(row,col,i-1,j+1);
		}	
		if((j-1)>=0){
			if(matrix[i+1][j-1]==1)
				dfs(row,col,i+1,j-1);
		}
		if(matrix[i+1][j+1]==1)
			dfs(row,col,i+1,j+1);
		}
}

int main(){
	FILE *fp;
	char c;
	int i=0,j=0,row=0,col=0,count=0,index=0,max=0,min=0;
	char str[10]="conti.txt";
	fp = fopen(str,"r");
	while((c=getc(fp))!=EOF){	
		if(c=='#'){
			matrix[i][j]=1;
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
				islandcount[index]=jump;
				jump=0;
				index++;
			}
		}
	}
	min=islandcount[0];
	for(i=0;i<index;i++){
		if(max<islandcount[i])
			max=islandcount[i];
		if(min>islandcount[i])
			min=islandcount[i];	
	}	
	printf("\nBigger mass island: %d",max);
	printf("\nsmaller mass island:%d",min);
	printf("\nNumber of continents: %d\n",count);
	return 0;
}
