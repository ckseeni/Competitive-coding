#include<stdio.h>
#include<string.h>
int main(){
	char string[70],fen[70][70],bishop;
	char pos[]={'a','b','c','d','e','f','g','h'};
	char *token;
	int chess[9][9],path[9][9];
	int i=1,j=0,k=0,l,m,count=0,c=0,sti,stj;
	printf("\nEnter FEN: ");
	scanf("%s",string);
	token=strtok(string,"/");
	while(i<=9&&token!=NULL){	
		strcpy(fen[i],token);
		i++;		
		token=strtok(NULL,"/");
	}	
	for(i=1;i<=8;i++){
		for(j=0;j<8;j++)
			chess[i][j]=0;
	}
	if(!(strcmp(fen[9],"w")))
		bishop='B';
	else
		bishop='b';
	for(i=1;i<=8;i++){
		j=0;
		k=0;
		while(fen[i][j]!='\0'){
			if((int)fen[i][j]>=49&&(int)fen[i][j]<=57)
				k=k+(int)fen[i][j]-48;
			else if(fen[i][j]==bishop){
				chess[i][k]=1;
				k++;
				count++;
			}
			else{
				chess[i][k]=2;	
				k++;
			}	
			j++;
		}
	}
	while(c<count){
		for(i=1;i<=8;i++){
			for(j=0;j<8;j++){
				if(chess[i][j]==1){
					printf("\n[");
					sti=i;stj=j;
					for(l=i+1,m=j+1;chess[l][m]==0&&l<=8&&m<8;l++,m++)
						path[l][m]=1;
					for(l=i+1,m=j-1;chess[l][m]==0&&l<=8&&m>=0;l++,m--)
						path[l][m]=1;
					for(l=i-1,m=j+1;chess[l][m]==0&&l>=1&&m<8;l--,m++)
						path[l][m]=1;
					for(l=i-1,m=j-1;chess[l][m]==0&&l>=1&&m>=0;l--,m--)
						path[l][m]=1;		
					chess[i][j]=2;
					for(i=1;i<=8;i++){
						for(j=0;j<8;j++)
							if(path[i][j]==1)
								printf("%c%d%c%d, ",pos[stj],sti,pos[j],abs(i-9));
					}
					printf("]");
					for(i=1;i<=8;i++){
						for(j=0;j<8;j++)
							path[i][j]=0;
					}
				}
			}
		}
	c++;
	}
	return 0;
}
