#include<stdio.h>
#include<string.h>
int main(){
	char str1[10],str2[10],str3[10];
	int i,j,len1,len2,f=0;
	printf("\nEnter str1");
	scanf("%s",str1);
	printf("\nEnter str2");
	scanf("%s",str2);
	len1=strlen(str1);
	len2=strlen(str2);
	for(i=0;i<len1;i++){
		for(j=0;j<len2;j++){
			if(str1[i]==str2[j]){
				f=1;
			}
		}
	if(f==1)
		str3[i]=' ';
	else
		str3[i]=str1[i];
	f=0;	
	}	
	printf("\n%s",str3);
}
