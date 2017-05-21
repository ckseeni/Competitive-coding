#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
void tok(char *arr){
	char *ptr = strtok(NULL," ");
	if(ptr!=NULL){
		tok(ptr);
		printf("%s ",ptr);
	}
}
int main(){
	char arr[1000],*ptr;
	scanf("%[^\n]s",arr);
	ptr = strtok(arr," ");
	tok(arr);
	printf("%s ",ptr);
	return 0;	
}
/* Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I */

