#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h> //finding longest uncommon subsequences between two strings
int main(){
	char str1[100001],str2[100001];
	scanf("%s",str1);
	scanf("%s",str2);
	int c = 0,i=0;
	if(strcmp(str1,str2)==0)
		printf("-1");
	else if(strlen(str1)>strlen(str2))
		printf("%d",(int)strlen(str1));
	else
		printf("%d",(int)strlen(str2));
	return 0;
}
