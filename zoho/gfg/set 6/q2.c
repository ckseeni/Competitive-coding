#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*Given a string of integers find out all the possible words that can made out of it in continuous order. Eg: 11112

ans: AAAAB
AKAB
AAKB
AAAL etc.*/
int main(){
	char arr[1000],string[1000][1000];
	int f = 0,r = 0;
	scanf("%s",arr);
	for(int i=0;i<strlen(arr);i++)
		arr[i] = arr[i]-48+64;
	printf("\n%s",arr);
	strcpy(string[0],arr);
	while((f+1)!=(r)){
		//printf("\n%d %d",f,r);
		strcpy(arr,string[r]);
		r++;
		for(int i=0;i<strlen(arr)-1;i++){
			char t[1000];
			int m=0,fl=0;
			for(int l=0;l<strlen(arr);){
				if(l==i){
					int fr = arr[l]-64;
					int se = arr[l+1] - 64;
					int ind = fr*10 + se;
					//printf("\n %s %d %d %d %d",arr,arr[l],fr,se,ind+64);
					if(ind>27){
						fl=1;
						break;
					}
					t[m++] = ind+64;
					l++;
					l++;
				}
				else{
					t[m++] = arr[l];
					l++;
				}
			}
			if(fl!=1){
				t[m] = '\0';
				f=f+1;
				strcpy(string[f],t);
				printf("\n%s",string[f]);
			}
			//printf("\n%s",temp[tind-1]);
			//return 0;
		}
		//return 0;
	}
	return 0;
}
