import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		char f[] = first.toCharArray();
		char s[] = second.toCharArray();
		int matrix[][] = new int[second.length()+1][first.length()+1];
		for(int i=1;i<=first.length();i++){
			for(int j=1;j<=second.length();j++){
				if(f[i-1]!=s[j-1]){
					if(matrix[i][j-1]>=matrix[i-1][j])
						matrix[i][j]=matrix[i][j-1];
					else
						matrix[i][j]=matrix[i-1][j];
				}
				else
					matrix[i][j]=matrix[i-1][j-1]+1;
			}
		}
		System.out.println(matrix[first.length()][second.length()]);
    }
}
