#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
void create(int **arr,int stn,int stm,int n,int m,int d,int d2){
	int i,j;
	if(stm>=m)
		return;
	if(stn>=n)
		return;
	printf("\nstn %d stm %d",stn,stm);
	printf("\nn %d m %d\n",n,m);
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
	create(arr,stn,stm,n,m,d-1,d2);
}
int main(){
	int **arr;int n,m,i,j,v;
	scanf("%d %d %d",&n,&m,&v);
	arr = (int **)malloc(n*sizeof(int *));
	for(i=0;i<n;i++)
		arr[i] = (int *)malloc(m*sizeof(int));
	create(arr,0,0,n,m,v,1);
	for(i=0;i<n;i++){
		for(j=0;j<m;j++)
			printf("%d ",arr[i][j]);
		printf("\n");
	}
	return 0;	
}
/*1) Print the given pattern:
7 7 4
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

