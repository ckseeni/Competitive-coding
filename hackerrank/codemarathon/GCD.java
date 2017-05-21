import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long count=n;
        for(long p=2;p*p<=n;p++){
			if(n%p==0){
				//System.out.println(p);
				while(n%p==0)
					n=n/p;
				count = count - count/p;
				
				
			}
		}
		if(n>1)
			count=count-count/n;
        System.out.println(count);
        
    }
}
