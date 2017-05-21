#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	char string[100];
	int *arr;
	scanf("%s",string);
	arr = (int *)malloc(strlen(string)*sizeof(int));
	for(int i=0;i<strlen(string);i++){
		if(string[i]=='('&&arr[i]==0){
			int j;
			for(j=(int)strlen(string)-1;j>=0;j--){
				if((arr[j]==0)&&(string[j]==')')){
					arr[i] = 1;
					arr[j] = 1;
					break;
				}
			}
		}
		else if(string[i]==')'&&arr[i]==0){
			int j;
			for(j=i+1;j<strlen(string);j++){
				if(string[j]=='('&&arr[j]==0){
					arr[i] = 1;
					arr[j] = 1;
					break;
				}
			}
		}
	}
	for(int i=0;i<strlen(string);i++)
		printf("%d",arr[i]);
	printf("\n");
	for(int i=0;i<strlen(string);i++){
		if(string[i]=='('||string[i]==')'){
			if(arr[i]==1)
				printf("%c",string[i]);
		}
		else
			printf("%c",string[i]);
	}	
	return 0;
}
/*Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab) */

