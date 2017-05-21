#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
void create(char **arr,int stn,int stm,int n,int m,char d,int d2){
	int i,j;
	if(stm>=m)
		return;
	if(stn>=n)
		return;
	printf("\nstn %d stm %d",stn,stm);
	printf("\nn %d m %d\n",n,m);
	if(d2%2==1)
		d='X';
	else
		d='O';
	d2++;
	for(i=stn;i<n;i++){
		arr[i][stm] = d;
		arr[i][m-1] = d;
	} 
	for(i=stm;i<m;i++){
		arr[stn][i] = d;
		arr[n-1][i] = d;
	} 
	stn++;
	stm++;
	n--;
	m--;
	create(arr,stn,stm,n,m,d,d2);
}
int main(){
	char **arr;int n,m,i,j;
	scanf("%d %d",&n,&m);
	arr = (char **)malloc(n*sizeof(char *));
	for(i=0;i<n;i++)
		arr[i] = (char *)malloc(m*sizeof(char));
	create(arr,0,0,n,m,'X',1);
	for(i=0;i<n;i++){
		for(j=0;j<m;j++)
			printf("%c ",arr[i][j]);
		printf("\n");
	}
	return 0;	
}
/*1) Print the given pattern:
Input:
N= 3, M=3
Output:
X X X
X 0 X
X X X

Input:
N=4 M=5
Output:
X X X X
X 0 0 X
X 0 0 X
X 0 0 X
X X X X

Input:
N=6 M=7
X X X X X X
X 0 0 0 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 0 0 0 X
X X X X X X*/

