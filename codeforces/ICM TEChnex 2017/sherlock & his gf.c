Sherlock has a new girlfriend (so unlike him!). Valentine's day is coming and he wants to gift her some jewelry.

He bought n pieces of jewelry. The i-th piece has price equal to i + 1, that is, the prices of the jewelry are 2, 3, 4, ... n + 1.

Watson gave Sherlock a challenge to color these jewelry pieces such that two pieces don't have the same color if the price of one piece is a prime divisor of the price of the other piece. Also, Watson asked him to minimize the number of different colors used.

Help Sherlock complete this trivial task.
Input

The only line contains single integer n (1 ≤ n ≤ 100000) — the number of jewelry pieces.
Output

The first line of output should contain a single integer k, the minimum number of colors that can be used to color the pieces of jewelry with the given constraints.

The next line should consist of n space-separated integers (between 1 and k) that specify the color of each piece in the order of increasing price.

If there are multiple ways to color the pieces using k colors, you can output any of them.
Examples
Input

3

Output

2
1 1 2 

Input

4

Output

2
2 1 1 2

Note

In the first input, the colors for first, second and third pieces of jewelry having respective prices 2, 3 and 4 are 1, 1 and 2 respectively.

In this case, as 2 is a prime divisor of 4, colors of jewelry having prices 2 and 4 must be distinct.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int isprime(int n)
{
	int sqr;
	int i;

	i = 1;
	sqr = sqrt(n) + 1;
	while (++i < sqr)
		if (n % i == 0)
			return (0);
	return (1);
}

int main(void)
{
	int n;
	int i;
	char *resh;

	scanf("%d", &n);
	resh = malloc(n * sizeof(char));
	i = -1;
	while (++i < n)
	{
		if (isprime(i + 2))
			resh[i] = '1';
		else
			resh[i] = '2';
	}
	if (n > 2)
		printf("2\n");
	else
		printf("1\n");
	i = -1;
	while (++i < n)
		printf("%c ", resh[i]);
	return (0);
}




//mine
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>
int prime(int p){
	int i=2;
	//printf("%d   %d",p,(int)pow(p,1/2)+1);
	for(i=2;i<=sqrt(p);i++){
		//printf("\n\n%d \n\n",p%i);
		if(p%i==0)
			return 0;
	}
	return 1;
}
int main(){
	int n;
	scanf("%d",&n);
	int arr[n];
	//printf("%d",prime(4));
	for(int i=2;i<=n+1;i++){
		if(prime(i))
			arr[i-2] = 1;
		else
			arr[i-2] = 2;
	}
	if(n>2)
		printf("2\n");
	else
		printf("1\n");
	for(int i=2;i<=n+1;i++)
		printf("%d ",arr[i-2]);
	return 0;
}
