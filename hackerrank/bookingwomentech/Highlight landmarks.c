#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
char **target;
int k=0,l;
void tok(char *arr){
	char *ptr;
	ptr = strtok(NULL," ");
	int flag=1;
	if(ptr!=NULL){
		for(int i=0;i<l;i++){
			if(strcmp(ptr,target[i])==0)
				flag=0;
		}
		if(flag!=0){
			printf(" %s",ptr);
			tok(arr);
		}
		else{
			k++;
			printf(" <b>%s</b>",ptr);
			tok(arr);
		}
	}
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	char arr[3000],*ptr;
	int i;
	
	scanf("%[^\n]s",arr);
	scanf("%d",&l);
	target = (char **)malloc(l*sizeof(char *));
	for(i=0;i<l;i++){
		target[i] = (char *)malloc(100*sizeof(char));
		scanf("%s",target[i]);
	}	
	ptr = strtok(arr," ");
	int flag=1;
	if(ptr!=NULL){
		for(int i=0;i<l;i++){
			if(strcmp(ptr,target[i])==0)
				flag=0;
		}
		if(flag!=0){
			printf("%s",ptr);
			tok(arr);
		}
		else{
			k++;
			printf("<b>%s</b>",ptr);
			tok(arr);
		}
	}
    return 0;
}

