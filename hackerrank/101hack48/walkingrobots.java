import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int howManyCollisions(String s){
        // Complete this function
		StringBuffer buf = new StringBuffer();
		int f=1,i=0,c=0;
		for(i=0;i<s.length();i++){
			/*if(i==s.length()-1){
				if(f==0)
					buf.append(s.charAt(i));
			}*/
			if(i<s.length()-1&&s.charAt(i)=='r'&&s.charAt(i+1)=='l'){
				buf.append('d');
				i++;
				f=0;
				c = c+2;
			}
			else{
				buf.append(s.charAt(i));
				f=1;
			}
		}
		
		s = buf.toString();
		//System.out.println(s);
		int t=0,count=0;
		/*for(i=0;i<s.length();i++){
			if(s.charAt(i)!='d'&&t==0){
				if(s.charAt(i)=='r')
					count++;
			}
			if(s.charAt(i)!='d'&&t==1){
				if(s.charAt(i)=='l')
					count++;
			}
			if(s.charAt(i)=='d'){
				c = c+ count;
				count=0;
				if(t==0)
					t=1;
				else
					t=0;
			}
		}
		if(t==1)
			c = c + count;*/
		for(i=0;i<s.length();i++){
			if(s.charAt(i)=='r')
				count++;
			if(s.charAt(i)=='d'){
				c = c + count;
				count = 0;
			}
		}
		count=0;
		for(i=s.length()-1;i>=0;i--){
			if(s.charAt(i)=='l')
				count++;
			if(s.charAt(i)=='d'){
				c = c + count;
				count = 0;
			}
		}
		return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // Returns the number of times moving robots collide.
            int result = howManyCollisions(s);
            System.out.println(result);
        }
    }
}

