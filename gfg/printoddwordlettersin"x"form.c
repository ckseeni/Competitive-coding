#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char string[1000];
	printf("\nEnter String:");
	scanf("%s",string);
	//printf("%c",string[0]);
	//int c = 0;
	int st = 0,en = (int)strlen(string)-1;
	while(en!=st){
		for(int i=0;i<(int)strlen(string);i++){
			if(i==st||i==en)
				printf("%c",string[i]);
			else
				printf("%c",' ');
		}
		//c++;
		st++;
		en--;
		printf("\n");
	}
	int f = (int)(strlen(string)/2);
	int s = f+1;
	for(int i=0;i<f;i++)
		printf("%c",' ');
	printf("%c",string[f]);
	for(int i=s;i<(int)strlen(string);i++)
		printf("%c",' ');
	printf("\n");
	st--;
	en++;
	while(st>=0){
		for(int i=0;i<(int)strlen(string);i++){
			if(i==st||i==en)
				printf("%c",string[i]);
			else
				printf("%c",' ');
		}	
		st--;
		en++;
		printf("\n");
	}
	return 0;
}
