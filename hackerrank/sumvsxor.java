import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
		if(n==0){
			System.out.println("1");
			return;
		}
		String b = Long.toBinaryString(n);
		//System.out.println(b);
		int c = 0;
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)=='0')
				c++;
		}
		//System.out.println(c);
		System.out.println((long)Math.pow(2,c));
    }
}

