import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Finddigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int result[] = new int[t];
		if(t>=1&&t<=15){
			for(int a0=0;a0<t;a0++){
				int n = in.nextInt();
				if(n>0&&n<1000000000){
					int copy = n,count=0;
					int digit[] = new int[n];
					int i=0;
					while(copy!=0){
						int r=copy%10;
						digit[i]=r;
						i++;
						copy=copy/10;
					}
					int limit=i;
					for(i=0;i<limit;i++){
						int q;
						if(digit[i]!=0){
							q = n%digit[i];
							if(q==0)
								count++;
						}
					}
					result[a0]=count;
				}
			}
			for(int a0=0;a0<t;a0++)
				System.out.println(result[a0]);
		}
    }
}
