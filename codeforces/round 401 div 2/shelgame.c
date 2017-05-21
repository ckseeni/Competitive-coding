#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
int main(){
	int m,p;
	scanf("%d",&m);
	scanf("%d",&p);	
	int arr[3];
	for(int i=0;i<3;i++)
		arr[i] = 0;
	arr[p] = 1;
	m = m % 6;
	for(int i=m;i>0;i--){
		if(i%2==0){
			int t = arr[1];
			arr[1] = arr[2];
			arr[2] = t;
		}
		else{
			int t = arr[0];
			arr[0] = arr[1];
			arr[1] = t;
		}
	}
	for(int i=0;i<3;i++){
		if(arr[i]==1)
			printf("%d",i);
	}	
	return 0;
}
/*Fix the initial numeration of shells. Consider function p(i, j) to be the index of the shell located at position j after i moves.

    p(0) = {0, 1, 2}
    p(1) = {1, 0, 2}
    p(2) = {1, 2, 0}
    p(3) = {2, 1, 0}
    p(4) = {2, 0, 1}
    p(5) = {0, 2, 1}
    p(6) = {0, 1, 2} 

Thus, after 6 movements all shells will get back to initial positions. To solve the problem we need to take n modulo 6 and simulate that number of moves.



Bomboslav likes to look out of the window in his room and watch lads outside playing famous shell game. The game is played by two persons: operator and player. Operator takes three similar opaque shells and places a ball beneath one of them. Then he shuffles the shells by swapping some pairs and the player has to guess the current position of the ball.

Bomboslav noticed that guys are not very inventive, so the operator always swaps the left shell with the middle one during odd moves (first, third, fifth, etc.) and always swaps the middle shell with the right one during even moves (second, fourth, etc.).

Let's number shells from 0 to 2 from left to right. Thus the left shell is assigned number 0, the middle shell is 1 and the right shell is 2. Bomboslav has missed the moment when the ball was placed beneath the shell, but he knows that exactly n movements were made by the operator and the ball was under shell x at the end. Now he wonders, what was the initial position of the ball?
Input

The first line of the input contains an integer n (1 ≤ n ≤ 2·109) — the number of movements made by the operator.

The second line contains a single integer x (0 ≤ x ≤ 2) — the index of the shell where the ball was found after n movements.
Output

Print one integer from 0 to 2 — the index of the shell where the ball was initially placed.
Examples
Input

4
2

Output

1

Input

1
1

Output

0

Note

In the first sample, the ball was initially placed beneath the middle shell and the operator completed four movements.

    During the first move operator swapped the left shell and the middle shell. The ball is now under the left shell.
    During the second move operator swapped the middle shell and the right one. The ball is still under the left shell.
    During the third move operator swapped the left shell and the middle shell again. The ball is again in the middle.
    Finally, the operators swapped the middle shell and the right shell. The ball is now beneath the right shell. 


