#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
void binary(int *res,int num){
	int i=0;
	while(num!=0){
		res[i++] = num%2;
		num = num/2;
	}
}
int main(){
	int n,*res;
	scanf("%d",&n);
	int prev = 0,ind=1,curr=2,pow=2;
	while(1){
		if(n<curr){
			int num = n-prev;
			res = (int *)malloc(ind*sizeof(int));	
			binary(res,num);
			for(int i=ind-1;i>=0;i--){
				if(res[i]==0)
					printf("3");
				else
					printf("4");
			}
			break;
		}
		pow = pow*2;
		prev = curr;
		curr = curr + pow;
		ind++;
	}
	return 0;	
}/*Form a number system with only 3 and 4. Find the nth number of the number system.
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….*/

