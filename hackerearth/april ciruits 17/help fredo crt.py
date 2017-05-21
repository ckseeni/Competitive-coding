#include <stdio.h>
#include <math.h>
int main()
{
    int n;
    scanf("%d",&n);
    double res = 1;
	double p = (double)1/n;
    for(int i=0;i<n;i++){
        long temp;
        scanf("%ld",&temp);
		double t = (double)pow(temp,p);
        res = res * t;
    }
    
	int rt = (int)res;
	double r1 = (double)rt;
	if(r1<=res)
		rt++;
    printf("%d",rt);
    return 0;
}
#fact a^3 * b^3 = (a*b)^3  here replace 3 with 1/n-->lhs is minimum so that it dont exceed long limit
