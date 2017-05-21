import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		long t=in.nextLong();
		int ini=3,k,i=1,v=0;
		while(true){
			k=ini;
			while(i!=t+1&&ini!=0){
				v=ini;
				i++;
				ini--;
			}
			if(i==t+1){
				System.out.println(v);
				break;
			}
			ini=k*2;
		}
    }
}
