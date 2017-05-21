import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     	String s = in.next();
		String prev = new String();
		while(s.length()!=0&&s.equals(prev)!=true){
			int flag=0;
			StringBuffer curr = new StringBuffer();
			for(int i=s.length()-1;i>0;){
				if(flag==0){
					if(s.charAt(i)!=s.charAt(i-1)){
						curr.append(s.charAt(i));
						i--;
					}
					else{
						while(i>0&&s.charAt(i)==s.charAt(i-1)){
							i--;
						}
						flag=1;
						i--;
					}
				}
				else{
					curr.append(s.charAt(i));
					i--;
				}					
			}
			if(s.charAt(1)!=s.charAt(0))
				curr.append(s.charAt(0));
			prev = new String(s);
			curr = curr.reverse();
			s = curr.toString();
			if(prev.equals(s)==false)
				System.out.println(s);
		}  
	}
}

