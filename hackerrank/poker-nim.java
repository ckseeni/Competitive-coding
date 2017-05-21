import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
			int k = in.nextInt();
            long[] p = new long[n];
			long s = 0,c=0;
            for(int p_i=0; p_i < n; p_i++){
                p[p_i] = in.nextLong();
				s = s ^ p[p_i];
				
            }
			if(s==0)
				System.out.println("Second");
			else
				System.out.println("First");
            // your code goes here
        }
    }
}
/*ets assume you understand why XOR works with regular Nim, then for any Nim table, we can define a win state or a lose state. If you dont, then first complete that game.

Now, for poker nim a player can use their turn to add instead of remove, but has limited uses of this move, the move allows to change the win state of the game, so he players will use it to turn the state into their favor.

Game 1: Player 1 was going to win. As such XOR = 1, n = 3, k = 1, player 1 will use their turn to make XOR = 0 as that will make player 2 start with a lose state, player 2 will try to keep XOR = 0 and send it to player 1, as that means player 1 will receive a lose state. Eventually the uses of add will run out, and the final board will decide the winner.

2 2 1 -> xor=1

1:220 -> removes all from third pile, xor=0, and sends it to P2

2:receives lose state but cant turn it to xor=0, if he adds hes only wasting his limited uses of add, because player1 will be able to use their turn to reset it back to 220. P2 waits for a better chance

210

1:110

2:if player 2 removes he loses, as such he can only add, but he still cant make XOR=0, whatever he adds, player 1 can reset it back to 110, so player 2 will lose, the poker part did not change basic Nim. Just try it, add any value to any pile of 110 then realize that P1 can use their next turn to reset it back to 110. And the value of k will not have any effect because player 1 will be able to reset it back to 110 as many times as needed.

=> For every k, if player 1 receives a winning board, they will keep it that way without wasting charges of their own add ability.

Game 2: Player 1 was going to lose. XOR = 0, n = 2, k = 1, player 1 is forced to use their add ability to turn the board into a lose state for P2 because they are losing otherwise.

2 2 -> xor = 0

1: If they remove any value, xor will become 1, and be handed to P2 (win state for P2). If they add any value, xor will become 1 as well. As in Game 1, the losing player can choose to play remove and wait for a better opportunity, but that leads to 1 1 and the same result.

=> For every k, if P1 receives a losing board, they wont be able to change it, P2 will not even need to use their add ability once.

So the only change is to non optimal play, the add ability is only useful to correct mistakes on suboptimal play/allow an optimal player on a loss initial state to steal the game state from a sub optimal player.

1 |
Add Comment Parent Permalink

*/

