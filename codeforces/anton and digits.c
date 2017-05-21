#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main(){
	int k2,k3,k5,k6;
	scanf("%d%d%d%d",&k2,&k3,&k5,&k6);
	int min=k2;
	if(min>k5)
		min=k5;
	if(min>k6)
		min=k6;
	long s = min*256;
	if(k2>min){
		k2 = k2-min;
		min=k2;
		if(min>k3)
			min=k3;
		s = s+ min*32;
	}
	printf("%ld",s);
	return 0;
}
