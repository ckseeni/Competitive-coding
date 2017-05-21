#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
	long long int s=0,n;
	int k,l,sq,r;
	scanf("%llu",&n);
	for(int i=1;i<=n;i++){
		k=1;
		l=1;
		s=s+i;			
		while(k<=i){
			sq=(k*k)+(l*l);
			while(l<=i){
				r=i%sq;
				if(r==0){
					s=s+(2*k)+(2*l);
				}
				l++;
				sq=(k*k)+(l*l);
			}
			k++;
			l=0;
		}
		
	}
	printf("\n%llu",s);
	return 0;
}
