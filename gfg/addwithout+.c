#include<stdio.h>

int add(int a,int b){
	return printf("%*c%*c",a,' ',b,' ');
}

int main(){
	int a,b,r;
	scanf("%d%d",&a,&b);
	r = add(a,b);
	printf("\n%d",r);
	return 0;
}
