import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Strangecounter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		long t=in.nextLong();
		long v=0,diff,prev=0,curr=3,mul=6;
		if(t!=0){
			while(true){
				if(t>=prev&&t<=curr){
					diff=curr-t;
					v=diff+1;
					System.out.println(v);
					break;
				}
				prev=curr;
				curr=curr+mul;
				mul=mul*2;
			}
		}
    }
}
