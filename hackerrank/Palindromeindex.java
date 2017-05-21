import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int length;
	public static int isPalindrome(char[] cpy){
		int j=length-1,flag=0;
		for(int i=0;i<length/2;i++){
			//System.out.println(cpy[i]+" "+cpy[j]);
			if(cpy[i]!=cpy[j]){
				//System.out.println(cpy[i]+"   "+cpy[j]);
				flag=1;
				break;
			}
			j--;
		}
		if(flag==1)
			return 0;
		else
			return 1;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>0){
			String s = in.next();
			char[] giv = s.toCharArray();
			int j=s.length()-1;
			int index=-1,i;
			for(i=0;i<s.length()/2;i++){
				if(giv[i]!=giv[j]){
					char[] cpy = new char[s.length()];
					int l=0;
					for(int k=0;k<s.length();k++){
						if(k!=i){
							cpy[l]=giv[k];
							l++;
						}
					}
					//for(int k=0;k<s.length()-1;k++)
					//	System.out.println(cpy[k]);
					length = s.length()-1;
					int c = isPalindrome(cpy);
					//System.out.println(c);
					if(c==1){
						index=i;
						break;
					}
					else{
						index=j;
						break;
					}	
				}
				j--;
			}	
			if(i==s.length())
				System.out.println("-1");
			else
				System.out.println(index);
			n--;
		}
    }
}
