import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	while(t>0){
    		int n = in.nextInt();
    		int k = in.nextInt();
    		int b = in.nextInt();
    		int x[] = new int[b];
    		int j=0;
    		int count=0;
    		int sum=0;
    		int remaining = 0;
    		if((k*(k+1))/2>=n){
	    		for(int i=k;i>0;i--){
	    			
	    			if(k<=n-remaining){
	    				if(sum+k!=n){
	    				count++;
	    				x[j]=k;
	    				j++;
	    				remaining=k;
	    				sum = sum+k;
	    				}
	    				else if(count==b-1)
	    					x[j]=k;
	    			}
	    		}
	    		for(int i=0;i<=j;i++)
	    			System.out.print(x[i]+" ");
    		}
    		else
    			System.out.println(-1);
    		t--;
    	}
    }
}