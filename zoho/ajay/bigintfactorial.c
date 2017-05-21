#include<stdio.h>
#include<math.h>
#include<stdlib.h>
//bigint in c for factorial
int factorial(int n,int *r){
	int carry=0,m=1,sum=0;
	r[0] = 1;
	for(int i=1;i<=n;i++){
		for(int j=0;j<m;j++){
			sum = r[j]*i+carry;
			r[j] = sum%10;
			carry = sum/10;	
		}
		while(carry>0){
			r[m] = carry%10;
			m++;
			carry = carry/10;
		}
	}
	return m;
}

int main(){
	int res[200],m;
	int n;
	printf("\nEnter n:");
	scanf("%d",&n);
	m=factorial(n,res);
	for(int i=m-1;i>=0;i--)
		printf("%d",res[i]);
	return 0;
}
