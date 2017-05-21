#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(){
	int n,r1,r2,r3;
	char string1[10][100]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	char string2[10][100]={"","asd","twenty","thirty","fourty","fivty","sixty","seventy","eightty","ninty"};
	char another[10][100]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	char def[]={"hundred and"};
	scanf("%d",&n);
	if(n/10==0)
		printf("\n%s",string1[n%10]);	
	else if(n/100==0){
		if(n<20)
			printf("\n%s",another[n%10]);
		else{
			r1 = n%10;
			n = n/10;
			r2 = n%10;
			if(r1==0)
				printf("\n%s",string2[r2]);
			else	
				printf("\n%s %s",string2[r2],string1[r1]);
		}
	}
	else{
		if(n%100>=10&&n%100<=19){
			r1 = n%100;
			r1 = r1%10;
			n = n/100;
			r2 = n%10;
			printf("\n%s %s %s",string1[r2],def,another[r1]);
		}
		else{
			r1 = n%10;
			n = n/10;
			r2 = n%10;
			n = n/10;
			r3 = n%10;
			if(r1==0&&r2==0)
				printf("\n%s hundred %s",string1[r3],string2[r2]);	
			else if(r1==0)
				printf("\n%s %s %s",string1[r3],def,string2[r2]);	
			else
				printf("\n%s %s %s %s",string1[r3],def,string2[r2],string1[r1]);	
		}
	}
	return 0;	
}
/*o output the number in words (0-999)
Input: 234
Output: Two hundred and Thirty Four*/

