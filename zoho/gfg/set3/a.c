#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main(){
	char arr[1000];
	scanf("%s",arr);
	for(int i=0;i<strlen(arr);){
		char a = arr[i];
		int c=0;
		i++;
		while(arr[i]>=48&&arr[i]<=58){
			c = c*10 + (int)arr[i]-48;
			i++;
		}	
		for(int j=0;j<c;j++)
			printf("%c",a);
	}
	return 0;	
}
/*Write a program to give the following output for the given input

Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/
