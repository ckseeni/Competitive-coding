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
		int s = 0;
		for(int i=0;i<n;i++)
			s = s + in.nextInt();
		System.out.println(s/2+(s%2==0 ? ".0" : ".5"));
    }
}
