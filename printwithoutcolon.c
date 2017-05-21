#include<stdio.h>
#define N 10
int main(int num,char *argv[]){
	while(num<=N&&printf("\n%d",num)&&main(num+1)){
	}
	printf("%s",argv[0]);
}
