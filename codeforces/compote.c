#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	int a,b,c,s;
	scanf("%d%d%d",&a,&b,&c);
	for(int i=a;i>=0;i--){
		s=0;
		int b1 = 2*i;
		int c1 = 4*i;
		if(b1<=b&&c1<=c){
			s = i+b1+c1;
			break;	
		}
	}
	printf("%d",s);
	return 0;
}
