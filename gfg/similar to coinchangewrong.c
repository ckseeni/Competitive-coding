#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
/*
Count number of ways to reach a given score in a game

Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of ways to reach the given score.*/
int c=0;
void diff(int n){
	if(n==0){
		c++;
		return;
	}
	if(n-3>=0)
		diff(n-3);
	if(n-5>=0)
		diff(n-5);
	if(n-10>=0)
		diff(n-10);
}
int main(){
	int n;
	scanf("%d",&n);
	diff(n);
	//if(c%2==1)
	//	c=c-1;
	printf("\n%d",c/2);
	return 0;
}
