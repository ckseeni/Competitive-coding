#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
int main(){
	char str1[10];
	scanf("%s",str1);
	for(int i=0;i<strlen(str1)-1;i++){
		if(str1[i]==str1[i+1]){
			int j;
			for(j=i+1;j<strlen(str1);j++){
				if(str1[i+1]!=str1[j])
					break;
			}
			if(j==strlen(str1)){
				printf("Impossible");
				return 0;
			}
			char t = str1[i+1];
			str1[i+1] = str1[j];
			str1[j] = t;
		}
	}
	printf("%s",str1);
	return 0;
}
/*
Rearrange characters in a string such that no two adjacent are same

Given a string with repeated characters, task is rearrange characters in a string so that no two adjacent characters are same.

Note : It may be assumed that the string has only lowercase English alphabets.

Examples:

Input: aaabc 
Output: abaca 

Input: aaabb
Output: ababa 

Input: aa 
Output: Not Possible

Input: aaaabc 
Output: Not Possible
*/
