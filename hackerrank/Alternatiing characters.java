import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			String s = in.next();
			int count=0;
			for(int i=1;i<s.length();i++){
				if(Math.abs(s.charAt(i)-s.charAt(i-1))==0)
					count++;
			}
			System.out.println(count);
			t--;
		}
    }
}
