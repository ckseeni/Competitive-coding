#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char *s;
	s = (char *)calloc(100,sizeof(char));
	scanf("%s",s);
	int st = 0,max=-1,dis=-1;
	for(int i=0;i<(int)strlen(s);i++){
		if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||s[i]=='Y'){
			dis = i+1-st;
			if(dis>max)
				max=dis;
			st = i+1;	
		}
	}
	dis = (int)strlen(s)+1-st;
	if(dis>max)
			max=dis;
	printf("%d",max);
}
