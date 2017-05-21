#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
//lcs and longest palindromic subsequence(no need to be contagious) in a string (refer gfg)
int max(int a,int b){
	return (a>b) ? a : b;
}
int lps(char *x,char *y,int m,int n){
	int L[m+1][n+1];
	for(int i=0;i<=m;i++){
		for(int j=0;j<=n;j++){
			if(i==0||j==0)
				L[i][j] = 0;
			else if(x[i]==y[j])
				L[i][j] = L[i-1][j-1] + 1;
			else
				L[i][j] = max(L[i-1][j],L[i][j-1]);
		}
	}
	return L[m][n];
}
int main(){
	char x[] = "asmaemzx";
	int m = strlen(x);
	char y[m];
	for(int i=0;i<m;i++)
		y[i] = x[m-i-1];
	printf("\n%d\n",lps(x,y,m,m));
	return 0;
}
