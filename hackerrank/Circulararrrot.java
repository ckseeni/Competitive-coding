import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circulararrrot{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int arr[] = new int[n];
		int result[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int j=0;  
		k=k%n;
		for(int i=n-k;i<n;i++){
			result[j]=arr[i];
			j++;
		} 	
		for(int i=0;i<n-k;i++){
			result[j]=arr[i];
			j++;
		}
		while(q>0){
			int m = in.nextInt();
			System.out.println(result[m]);
			q--;
		}
   }
}
