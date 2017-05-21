import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlockandarray {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int arr[] = new int[n];
			int left=0,right=0,i=0;
			for(i=0;i<n;i++){
				arr[i]=in.nextInt();
				right=right+arr[i];
			}
			right=right-arr[0];
			for(i=0;i<n;i++){
				if(left==right)
					break;
				else{
					left=left+arr[i];
					if(i<n-1)
						right=right-arr[i+1];
				}
			}
			if(i==n)	
				System.out.println("NO");
			else if(i<n)
				System.out.println("YES");
			t--;
		}		
   }
}
