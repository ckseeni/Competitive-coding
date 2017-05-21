#include<string.h>
#include<stdio.h>
int main(){
	int arr[100]={1,2,1};
	char c,d,r;
	char st[100],co[100];
	c=(char)(arr[0]+48);
	d=(char)(arr[1]+48);
	co[0]=c;
	co[1]=d;
	printf("%s",co);
	return 0;
}
