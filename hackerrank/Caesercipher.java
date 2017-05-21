import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
		char[] giv = s.toCharArray();
		char[] out = new char[n];
		char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] alp1 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<n;i++){
			if(giv[i]>=97&&giv[i]<=122){
				int a = (int)(giv[i]-97);
				a=(a+k)%26;
				out[i]=alp[a];	
			}
			else if(giv[i]>=65&&giv[i]<=90){
				int a = (int)(giv[i]-65);
				a=(a+k)%26;
				out[i]=alp1[a];	
			}
			else
				out[i]=giv[i];
		}
		String o = new String(out);
		System.out.println(o);
    }
}

