#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	int t,i,c,j,k;
	char s[100];
	scanf("%d",&t);
	for(i=0;i<t;i++){
		c = 0;
		scanf("%s",s);
		for(j=strlen(s)-1;j>=0;j--){
			if(s[j]=='-'){
				c++;
				for(k=j;k>=0;k--){
					if(s[k]=='-')
						s[k] = '+';
					else
						s[k] = '-';
				}
			}
		}
		printf("Case #%d: %d\n",i+1,c);
	}    
    return 0;
}

