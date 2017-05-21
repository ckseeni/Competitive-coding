import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
		int diff = 0;
		int i=0,j=0;
		if(s.equals(t)){
			System.out.println("Yes");
			return;
		}
		if(s.toLowerCase().contains(t.toLowerCase())){
			//if(s.length()>t.length()){
				int d = Math.abs(s.length()-t.length());
				if(k>=d)
					System.out.println("Yes");
				else
					System.out.println("No");
				return;
			
		}
		if(t.toLowerCase().contains(s.toLowerCase())){
			int d = Math.abs(s.length()-t.length());
				if(k>=s.length()+t.length())
					System.out.println("Yes");
				else if(d!=1&&k%d==0)
					System.out.println("Yes");
				else
					System.out.println("No");
				return;	
		}
		for(;i<s.length()&&j<t.length();i++,j++){
			if(s.charAt(i)!=t.charAt(i))
				break;
		}
		diff = s.length()-i+t.length()-j;
		if(k==diff||k>=s.length()+t.length())
			System.out.println("Yes");
		else
			System.out.println("No");
    }
}

