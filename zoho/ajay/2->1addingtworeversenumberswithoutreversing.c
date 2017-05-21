#include<stdio.h>
#include<math.h>

int count(int x){
	int c = 0;
	while(x!=0){
		c++;
		x = x/10;
	}
	return c;
}

int calculate(int co){
	co--;
	int r = 1;
	while(co>0){
		r = r*10;
		co--;
	}
	return r;
}

int main(){
	int a,b;
	scanf("%d%d",&a,&b);
	int tot = 0,k=1;
	int count1 = count(a);
	int count2 = count(b);
	int c = 0,s=0;
	while(a>0&&b>0){
		int divider1 = calculate(count1);
		int divider2 = calculate(count2);
		//printf("\n %d %d %d %d\n",divider1,divider2,a,b);
		s = c + a/divider1 + b/divider2;
		c = s/10;
		s = s%10;
		tot = tot + s*k;
		//printf("tot %d s %d k %d",tot,s,k);
		k=k*10;
		a = a%divider1;
		b = b%divider2;
		count1--;
		count2--;
	}
	while(a>0){
		int divider1 = calculate(count1);
		s = c + a/divider1;
		c = s/10;
		s = s%10;
		tot = tot + s*k;
		//printf("tot %d s %d k %d",tot,s,k);
		k=k*10;
		a = a%divider1;
		count1--;
	}
	while(b>0){
		int divider2 = calculate(count2);
		//printf("\n %d %d %d %d\n",divider1,divider2,a,b);
		s = c + b/divider2;
		c = s/10;
		s = s%10;
		tot = tot + s*k;
		//printf("tot %d s %d k %d",tot,s,k);
		k=k*10;
		b = b%divider2;
		count2--;
	}
	if(c!=0)
		tot = tot + c*k;
	printf("%d",tot);
}
