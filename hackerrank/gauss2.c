#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
	long long int s=0,n;
	int k,l,sq,r,r1;
	scanf("%llu",&n);
	for(int i=1;i<=n;i++){
		printf("\nfor %d",i);
		k=1;
		l=1;
		while(k<=i){
			r=i%k;
			if(r==0)
				s=s+k;
			while(l<=i){
				sq=(k*k)+(l*l);
				r=sq%i;
				r1=i%sq;
				if((r==0||r1==0)&&i!=1)
					s=s+(2*k);
				l++;
			}
			k++;
			l=1;
		}	
	}
	printf("\n%llu\n",s);
	return 0;
}
