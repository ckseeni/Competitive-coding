import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		while(g>0){
			int n = in.nextInt();
			int s = 0;
			for(int i=0;i<n;i++){
				int x = in.nextInt();
				s = s^x;
			}
			if(s==0)
				System.out.println("Second");
			else
				System.out.println("First");
			g--;
		}
    }
}

/*Nim is a two player combinatorial/mathematical game strategy. Given a number of piles which in each pile contains some numbers of stones. In each turn, player choose one pile and remove any number of stones (at least one) from that pile. In a normal play, player who cannot move is considered lose (ie., one who take the last stone is the winner). There is another variation where player who cannot move is considered as winning (misere play).

Nim game is an impartial game, which means the possible moves from any position are the same for each player. The only difference between two players is who move first. Chess, for example, is not an impartial game because one player play white pieces while the other play black pieces. According to this, ANY impartial game can be transformed into a Nim game using Sprague-Grundy Theorem. So, solving a Nim game is essential to solve any impartial game. I’ll discuss about Grundy number in other time.

Fortunately, there is a simple winning formula for Nim game.

Any position where the xor value of all piles is not zero is a winning position, otherwise it is a losing position. This xor value usually refered as nim-sum.

For example, let there be 5 piles of stones consisting: {2, 5, 1, 7, 3} stones respectively. The nim-sum of those piles are: 2 ⊕ 5 ⊕ 1 ⊕ 7 ⊕ 3 = 2, which is a winning position (who ever play first have a winning strategy). Another example, let there be 5 piles of stones consisting: {3, 5, 1, 4, 3} stones respectively. The nim-sum of those piles are: 3 ⊕ 5 ⊕ 1 ⊕ 4 ⊕ 3 = 0, which is a losing position (who ever play second have a winning strategy). When I said “winning strategy”, it means there is a strategy which ensure the winning of the respective player.

What is the reason behind that formula?

Here is the main idea. If the nim-sum is not zero, you always have at least one move which change the nim-sum into zero. In other hand, if the nim-sum is zero, you can only change it into a non-zero nim-sum. Note that the end game state (no stones) have a zero nim-sum. Which means, whoever is able to maintain the zero nim-sum for his/her enemy will win this game.

Let x1, x2, …, xn be the size of piles before a move, and y1, y2, …, yn be the size of piles after a move. Let s = x1 ⊕ x2 ⊕ … ⊕ xn (ie., nim-sum before a move) and t = y1 ⊕ y2 ⊕ … ⊕ yn (ie., nim-sum after a move).

First we observe the relation between s and t. In this game a move consists of removing any number of stones (at least 1) from any one pile. Supposed the chosen pile is pile k, so xk is its previous number of stones in kth, yk is its number of stones after the move, and xk ≠ yk because we have to remove at least 1 stone, or to be precise, yk < xk.

Notice that x ⊕ x = 0 and xor obeys associative and commutative laws.

t = 0 ⊕ t
  = s ⊕ s ⊕ t
  = s ⊕ (x1 ⊕ ... ⊕ xn) ⊕ (y1 ⊕ ... ⊕ yn)
  = s ⊕ (x1 ⊕ y1) ⊕ ... ⊕ (xn ⊕ yn)
  = s ⊕ 0 ⊕ ... ⊕ 0 ⊕ (xk ⊕ yk) ⊕ 0 ⊕ ... ⊕ 0
  = s ⊕ xk ⊕ yk
 
t = s ⊕ xk ⊕ yk    (1)

We will use (1) equation to proof the subsequence lemma.

Lemma 1. If s = 0, then t ≠ 0 no matter what the move is made.
Proof: From (1) we can see that if s = 0, then any move will produce t ≠ 0 because xk ⊕ yk ≠ 0 (since xk ≠ yk).

Lemma 2. If s ≠ 0, then it always possible to make a move so t = 0.
Proof: This following strategy will cause t = 0. Find d,the leftmost non-zero bit in binary representation of s and choose pile k (any pile) which dth bit is also non-zero. Such k must exists, otherwise dth of s must be zero. Then we can claim that yk < xk for yk = s ⊕ xk since all bits to the left of d is the same in xk and yk, while the dth bit is changed from 1 to 0, and the remaining right bits can only do at most 2d-1 changes.

t = s ⊕ xk ⊕ yk
  = s ⊕ xk ⊕ (s ⊕ xk)
  = 0

Thus the respective player can make a move by taking xk – yk stones from pile k.

This following example will ilustrate the strategy used in proof of lemma 2.

Let there be 5 piles which stones are: {18, 6, 3, 20, 9).

18: 1 0 0 1 0
 6: 0 0 1 1 0
 3: 0 0 0 1 1
20: 1 0 1 0 0
 9: 0 1 0 0 1
------------- ⊕
 s: 0 1 0 1 0

The leftmost 1-bit of s lies in the 4th. Find any pile which 4th bit is 1, in our case, there’s only one: pile with 9 stones. Change the 4th bit of that pile (with 9 stones) into 0. Because of changing this 4th bit, we already ensure that the value of that pile will be less than its previous value (9) no matter what changes we’ll make in the remaining right bits. So, for the right bits, change all bit positions from 0 to 1 or vice-versa wherever it is 1 in s (we want to make t = 0).

18: 1 0 0 1 0*
 6: 0 0 1 1 0
 3: 0 0 0 1 1
20: 1 0 1 0 0
 3: 0 0 0 1 1
------------- ⊕
 t: 0 0 0 0 0

If the player always maintain t = 0 for his/her enemy, then at the end he/she will win this game as nim-sum for the end game (no stones) is zero.

I’ll discuss several example of impartial game which turn out to be Nim Game in the next post.*/
