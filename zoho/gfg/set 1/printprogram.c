#include<stdio.h>
#include<stdlib.h>
int main(){
	char *arr;
	int n;
	printf("\nEnter string length");
	scanf("%d",&n);
	arr = (char *)malloc(n*sizeof(char));
	printf("\nEnter string");
	scanf("%s",arr);
	int st = 0,en = n-1;
	printf("\n");
	while(st!=n){
		for(int i=0;i<n;i++){
			if(i==st||i==en)
				printf("%c",arr[i]);
			else
				printf("%c",' ');
		}
		printf("\n");
		st++;
		en--;
	}
	return 0;
}
/*1. Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M */
