#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>
int main(){
	char arr1[20],arr2[20];
	scanf("%s",arr1);
	scanf("%s",arr2);
	printf("%s %s",arr1,arr2);
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		char a1[20],a2[20];
		scanf("%s %s",a1,a2);
		if(strcmp(a1,arr1)==0)
			strcpy(arr1,a2);
		else
			strcpy(arr2,a2);
		printf("\n%s %s",arr1,arr2);
	}
	
	return 0;
}
