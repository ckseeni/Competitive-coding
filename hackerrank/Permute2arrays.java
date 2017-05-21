import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Permute2arrays {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while(q>0){
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] =new int[n];
			int b[] =new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n;i++)
				b[i]=in.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			int j=n-1,i;
			for(i=0;i<n;i++){
				if(a[i]+b[j]<k)
					break;
				j--;
			}
			if(i==n)
				System.out.println("YES");
			else
				System.out.println("NO");
			q--;
		}		
   }
}
