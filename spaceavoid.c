#include<stdio.h>
int main(){
	char string[100],temp='\0';
	int i=0,n,flag=0,k=0;
	while(temp!='\n'){
		scanf("%c",&temp);	
		string[i]=temp;
		i++;
	}
	n=i;
	for(i=0;i<n;i++){
		if(string[i]!=' '){
			flag=0;			
			string[k]=string[i];
			k++;
		}
		else if(string[i]==' '){
			if(flag==0){
				string[k]=string[i];
				flag=1;
				k++;
			}
		}
	}
	n=k;
	for(i=0;i<n-4;i++)
		printf("%c",string[i]);
	
	return 0;
}
