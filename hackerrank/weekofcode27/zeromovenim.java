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
            long[] p = new long[n];
			long s = 0;
            for(int p_i=0; p_i < n; p_i++){
                p[p_i] = in.nextLong();
				if(p[p_i]%2==0)
					s = s ^ (p[p_i]-1);
				else
					s = s ^ (p[p_i]+1);
            }
			if(s!=0)
				System.out.println("W");
			else
				System.out.println("L");
            // your code goes here
        }
    }
}

