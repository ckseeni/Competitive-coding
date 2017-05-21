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
		while(n>0){
			String s = in.next();
			int result=0;
			int j=s.length()-1;
			for(int i=0;i<s.length()/2;i++){
				if(s.charAt(i)!=s.charAt(j)){
					int abs = Math.abs(s.charAt(i)-s.charAt(j));
					result=result+abs;
				}
				j--;
			}
			System.out.println(result);
			n--;
		}
    }
}
