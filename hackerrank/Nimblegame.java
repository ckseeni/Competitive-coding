

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
				x = x%2;
				if(x==1)
					s = s^i;   ////DDDDOOOOOOUUUUUUBBBBBBBBBTTTTTTTTTTT//
			}
			if(s==0)
				System.out.println("Second");
			else
				System.out.println("First");
			g--;
		}
    }
}
/*This is a variation on the standard Nim game. If a coin is located at the square, you can think of it just as you would think of a pile of stones. Moving a coin to the left is just like taking a stone from a stone pile.

After you reduce the game to standard Nim, you can find the XOR sum to solve the game. Notice that square has stones of size . No matter how large the value of is, you can easily find the XOR sum by checking if is even or odd.*/


