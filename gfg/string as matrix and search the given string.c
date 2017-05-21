#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char matrixstring[1000],searchstring[1000];
	printf("\nEnter matrix string:");
	scanf("%s",matrixstring);
	int len = strlen(matrixstring);
	int d;
	for(int i=1;;i++){
		int sq = i*i;
		if(len<sq){
			d=i;
			break;
		}
	}
	char matrix[d][d];
	int k = 0;
	for(int i=0;i<d;i++){
		for(int j=0;j<d;j++){
			if(k<len)
				matrix[i][j] = matrixstring[k++];
			else
				break;
		}
	}	
	for(int i=0;i<d;i++){
		for(int j=0;j<d;j++){
			printf("%c",matrix[i][j]);
		}
		printf("\n");
	}	
	printf("\nEnter search string:");
	scanf("%s",searchstring);
	int len1 = strlen(searchstring);
	k=0;
	for(int i=0;i<d;i++){
		for(int j=0;j<d;j++){
			int prevj = j;
			if(searchstring[k]==matrix[i][j]){
				while(searchstring[k]==matrix[i][j]&&k<len1){
					k++;
					j++;
				}		
				if(k==len1){
					printf("\nstart: (%d,%d) end:(%d,%d)",i,prevj,i,j-1);	
				}
			}
			j=prevj;
			k=0;
		}
	}
	printf("\n");
	k=0;
	for(int j=0;j<d;j++){
		for(int i=0;i<d;i++){
			int previ = i;
			if(searchstring[k]==matrix[i][j]){
				while(searchstring[k]==matrix[i][j]&&k<len1){
					k++;
					i++;
				}		
				if(k==len1){
					printf("\nstart: (%d,%d) end:(%d,%d)",previ,j,i-1,j);	
				}
			}
			i=previ;
			k=0;
		}
	}
	return 0;
}
