#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
	int t,n,c=0,i,f,s;
	scanf("%d",&t);
	while(t>0){
		scanf("%d",&n);
		if(n==2)
			printf("1\n");
		else if(n%2!=0)
			printf("0\n");
		else{
			//printf("asdfasdfadsf");
			for(i=2;i<=sqrt(n);i++){
				//printf("\n%d %d",i,n/i);
				f = i;
				s = n/i;
				if(f!=s){
					if(n%f==0&&f%2==0)
						c++;
					if(n%s==0&&s%2==0)
						c++;
				}
				else{
					if(n%i==0&&i%2==0)
						c++;
				} 
			}
			printf("%d\n",c+1);
			c=0;
		}
		t--;
	} 
    return 0;
}

