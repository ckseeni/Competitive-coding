#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	int n,i=0,k=1,j=0,c=1,l=0;
	int arr[1000000],curr[1000000];
	scanf("%d",&n);
	arr[0]=1;
	for(i=0;i<n;i++){
		for(j=0;j<k;j++)
			printf("%d",arr[j]);
		printf("\n");
		l=0;
		for(j=0;j<k-1;j++){
			if(arr[j]==arr[j+1])
				c++;
			else{
				curr[l++] = c;
				c=1;
				curr[l++] = arr[j];
			}
		}
		curr[l++] = c;
		c=1;
		curr[l++] = arr[j];
		k=l;
		for(j=0;j<k;j++)
			arr[j] = curr[j];
	}
	return 0;	
}
/*To find the print the pattern:
Ip: n=5
Op:
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1*/

