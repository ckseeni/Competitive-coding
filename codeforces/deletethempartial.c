#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main(){
	int n,d;
	scanf("%d%d",&n,&d);
	char s[100][100],ans[100];
	for(int i=0;i<n;i++)
		scanf("%s",s[i]);
	int delete[d];
	for(int i=0;i<d;i++)
		scanf("%d",&delete[i]);
	int min=101,max=-1;
	for(int i=0;i<d;i++){
		//printf("\n%d",(int)strlen(s[delete[i]-1]));
		if((int)strlen(s[delete[i]-1])>max)
			max = (int)strlen(s[delete[i]-1]);
		if((int)strlen(s[delete[i]-1])<min)
			min = (int)strlen(s[delete[i]-1]);
	}
	//printf("%d %d",max,min);
	for(int j=0;j<min;j++){
		ans[j] = s[delete[0]-1][j];
		//printf("\nans%c",ans[j]);
		int i=1;
		for(i=1;i<d;i++){
			//printf("\nans%c",s[delete[i]-1][j]);
			if(ans[j]!=s[delete[i]-1][j])
				break;	
		}
		if(i<d)
			ans[j]='?';
	}
	int flag=0;
	if(min!=1&&max!=1){
		for(int i=0;i<min;i++){
			if(ans[i]!='?')
				flag=1;
		}
		if(flag==0){
			printf("No");
			return 0;
		}
	}
	for(int i=0;i<min;i++){
			if(ans[i]!='?')
				flag=1;
		}
	if(flag==0&&min==1&&max>1){
		printf("No");
		return 0;
	}
		
		printf("Yes\n");
		if(min==1&&max==1)
			printf("?");
		else{
		int j = 0;
		for(j=0;j<min;j++)
			printf("%c",ans[j]);
		for(;j<max;j++)
			printf("?");
		}
	
	return 0;
}
