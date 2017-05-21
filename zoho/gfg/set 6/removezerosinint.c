#include<stdio.h>
#include<stdlib.h>
#include<string.h>
//remove zeros in the integer
int main(){
	int n,r,s=0,c=1;
	scanf("%d",&n);
	while(n!=0){
		r = n%10;
		if(r!=0){
			s = r*c + s;
			c = c*10;
		}
		n= n/10;
	}
	printf("\n%d",s);
	return 0;
}
