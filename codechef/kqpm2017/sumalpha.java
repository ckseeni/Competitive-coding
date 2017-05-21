import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		while(n>0){
			String s = in.next();
			int t =0;
			for(int i=0;i<s.length();i++){
				int r = (int)s.charAt(i)-97;
				r = r%5;
				t =t +r;
			}
			System.out.println(t);
			n--;
		}
    }
}


