#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
//substring of a string
int main(){
	char s[10000],sub[10000];
	int i,j;
	scanf("%s",s);
	//printf("%d",(int)strlen(s));
	for(i=0;i<strlen(s);i++){
		//printf("sadf");
		for(j=i;j<strlen(s);j++){
			strncpy(sub,s+i,j-i+1);
			printf("%s\n",sub);
			sub[strlen(sub)-1] = '\0';
		}
		for(j=0;j<strlen(s);j++)
			sub[j] = '\0';
	}
	return 0;	
}

