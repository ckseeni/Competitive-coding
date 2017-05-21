#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	char arr[1000],str[1000];
	scanf("%s",arr);
	printf("\n");
	scanf("%s",str);
	long int d = strstr(arr,str)-arr;
	if(d>=0)
		printf("%ld",d);
	else
		printf("\nNot present!!");
	return 0;	
}

