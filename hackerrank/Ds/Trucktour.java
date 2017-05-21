import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long amt[] = new long[n];
		long dis[] = new long[n];
		long tot=0;
		int i=0;
		while(i<n){
			amt[i]=in.nextLong();
			dis[i]=in.nextLong();
			i++;
		}
		i=0;
		int j=0;
		while(i<n){
			while(tot>=0){
				tot=tot+amt[j];
				tot=tot-dis[j];
				j++;
				j=j%n;
				if(j==i&&tot>=0){
					System.out.println(i);
                    return;
                }
			}
			i=j;
            tot=0;
		}
    }
}
