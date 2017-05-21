import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gridland {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		if(n>=1&&n<=(Math.pow(10,9))&&m>=1&&m<=(Math.pow(10,9))&&k>=0&&k<=1000){
			int count=0;
			int s =0;
			while(k!=0){
				int r=in.nextInt();
				int c1=in.nextInt();
				int c2 = in.nextInt();
				count = count+(c2+1-c1);
				k--;
			}
			s = (n*m)-count;
			System.out.println(s);
		}
		
    }
}
