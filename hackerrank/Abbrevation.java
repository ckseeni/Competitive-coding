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
		for(int i=0;i<n;i++){
			String s1 = in.next();
			String s2 = in.next();
			String s3 = s1.toUpperCase();
			int j=0;
			int arr[] = new int[26];
			for(int k=0;k<s2.length();k++){
				int index = (int)s2.charAt(k);
				if(index>=65&&index<=90){
					index=index-65;
					arr[index]=1;
				}
			}	
			int k;
			for(k=0;k<s1.length();k++){
				int index = (int)s1.charAt(k);
				if(index>=65&&index<=90){
					index=index-65;
					if(arr[index]==0){
						System.out.println("NO");
						break;
					}
				}				
			}	
			if(k==s1.length()){
				char[] some = s1.toCharArray();
				char[] modified = new char[s1.length()];
				int l=0;
				for(int m=0;m<s1.length();m++){
					if(some[m]>=65&&some[m]<=90){
						modified[l]=some[m];
						l++;
					}
				}
				String s4 = new String(modified);
				while((j+s2.length())<=s4.length()){
					if(s4.substring(j,j+s2.length()).equals(s2)){
						System.out.println("YES");
						break;
					}
					j++;
				}
				if((j+s2.length())>s4.length())
					System.out.println("NO");
			}
		}
    }
}
