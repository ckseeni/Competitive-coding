#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	char arr[1000],string[1000][1000];
	char *ptr;
	scanf("%[^\n]s",arr);
	int k=0;
	ptr = strtok(arr," ");
	while(ptr!=NULL){
		strcpy(string[k++],ptr);
		ptr = strtok(NULL," ");
	}
	for(int i=k-1;i>=0;i--)
		printf("%s ",string[i]);
	return 0;	
}
/* Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I */

