import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			ArrayList<Long> arr = new ArrayList<Long>();
			int n = in.nextInt();
			long a = in.nextLong();
			long b = in.nextLong();
			if(a>b){
				long temp=a;
				a=b;
				b=temp;
			}
			long res = a*(n-1);
			arr.add(res);
			for(int i=0;i<n-1;i++){
				res = res + (b-a);
				if(!arr.contains(res))
					arr.add(res);
			}
			for(Long x : arr)
				System.out.print(x+" ");
			arr.clear();
			System.out.println();
			t--;
		}
    }
}
