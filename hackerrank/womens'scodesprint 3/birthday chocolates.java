import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int c =  0;
        for(int i=0;i<=n-m;i++){
            int s = 0;
			//System.out.println();
            for(int j=i;j<i+m;j++){
				//System.out.print(squares[j]+" ");
                s = s + squares[j];    
            }
            if(s==d)
                c++;
        }
        System.out.println(c);
        // your code goes here
    }
}

