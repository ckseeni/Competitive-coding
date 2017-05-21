#include<stdio.h>
#include<string.h>
int main(){
	char str[100],ans[100];
	int i=0,j,flag=0,k=0,s=0,k1,flag1=1,common=0;
	printf("\nEnter string:");
	scanf("%s",str);
	while(1){
		k=0;
		s=0;
		while(str[i]!='\0'){
			j=i+1;
			if(str[i]==str[j]){
				common=1;
				flag=1;
				while(flag){
					if(str[j]==str[j+1]){
						j++;
					}
					else
						flag=0;	
				}
				i=j+1;
			}
			else{
				ans[k++]=str[i];
				i++;
			}
		
		}
		if(k==0||common==0){
			printf("\nNot further reduced");			
			break;
		}
		common=0;
		for(s=0;s<100;s++)
			str[s]='\0';
		s=0;
		for(k1=0;k1<k;k1++){
			printf("%c",ans[k1]);
			str[s++]=ans[k1];
		}
		printf("\n");
		i=0;		
	}
	return 0;
}
