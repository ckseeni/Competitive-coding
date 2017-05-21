#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	char arr[1000],prev[1000];
	scanf("%s",arr);
	while(strlen(arr)!=0&&(strcmp(arr,prev))){
		int flag = 0,k=0;
		char curr[1000];
		if(strlen(arr)==2&&arr[0]==arr[1]){
			printf("\n");
			break;
		}
		for(int i=strlen(arr)-1;i>0;){
			if(flag==0){
				if(arr[i]!=arr[i-1]){
					curr[k++]=arr[i];
					i--;
				}
				else{
					while(i>0&&arr[i]==arr[i-1]){
						i--;
					}
					flag=1;
					i--;
				}
			}
			else{
				curr[k++] = arr[i];
				i--;
			}					
		}
		curr[k++] = arr[0];	
		int i;
		for(i=0;i<strlen(arr);i++)
			prev[i] = arr[i];
		prev[i] = '\0';
		char rev[1000];
		for(int i=0;i<k;i++)
			rev[i]=curr[k-i-1];
		for(i=0;i<k;i++)
			arr[i] = rev[i];
		arr[i] = '\0';
		if(strcmp(prev,arr))
			printf("%s\n",arr);
	}
	return 0;	
}

