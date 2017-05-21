import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//The second theorem says that an integer n is a linear combinations of a and b if and only if n is a multiple of gcd(a,b).
//In order to solve the problem, you only have to compute d:=gcd(a,b) and check if c is not greater than max(a,b) and c is a multiple of d. If it is, the answer is YES.
public class Solution {

	public static int gcd(int n1,int n2){
		if(n2==0)
			return n1;
		else {if(n1<n2)
				return gcd(n2,n1);
			else
				return gcd(n2,n1%n2);
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int max = Math.max(a,b);
			//int min = Math.max(a,b);
			int g = gcd(a,b);
			//System.out.println(g);
			if(max>=c&&c%g==0)
				System.out.println("YES");
			else
				System.out.println("NO"); 
			t--;
		}
    }
}
