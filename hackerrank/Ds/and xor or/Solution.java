import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		int max=-1;
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			while(!s.isEmpty()){
				max = Math.max(max,a^s.peek());
				if(a<s.peek())
					s.pop();
				else
					break;	
			}
			s.push(a);
		}
		System.out.println(max);
    }
}

(((A B) ^ (A + B)) (A ^ B)) =           
apply A ^ B = (A'B) + (A B')
( ((A B)' (A + B)) + ((A B) (A + B)')) (A ^ B)) =   
apply DeMorgan law (X+Y+...)'=X'Y'Z'... and (XYZ...)'=X'+Y'+...
( ((A' + B') (A + B)) + ((A B) (A' B'))) (A ^ B)) = 
apply Distributive Law X(Y+Z) = XY + XZ
(A'A + A'B + AB' + BB' + AA' + BB') (A ^ B) =       
apply X+X=X, XX=X
(A'B + AB') (A ^ B) =
(A ^ B) (A ^ B) = A ^ B = A xor B

