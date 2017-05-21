#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int count(int n){
	for(int i=10,c=1;;i=i*10,c++){
		if(n/i==0)
			return c-1;
	}
}
int main(){
	int n,*arr,m,k=0,r,i;
	scanf("%d",&n);
	m = count(n);
	arr = (int *)malloc(m*sizeof(int));
	while(n!=0){
		n = n-1;
		arr[k++] = n%26;
		n = n/26;	
	}
	for(i=k-1;i>=0;i--)
		printf("%c",arr[i]+65);
	return 0;	
}
/*1) To output the given string for the given input which is an integer.
Input: 1
Output: A
Input: 26
Output: Z
Input : 27
Output: AA
Input: 28:
Output: AB
Input: 1000
Output: ALL

*/

