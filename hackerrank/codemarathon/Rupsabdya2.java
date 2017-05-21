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
		int A[] = new int[n];
		int B[] = new int[n];
		for(int i=0;i<n;i++)
			A[i] = in.nextInt();
		for(int i=0;i<n;i++)
			B[i] = in.nextInt();
		long count=0,currsumA=0,currsumB=0;
		int flag=0;
		for(int i=0;i<n;i++){
			if(A[i]!=B[i]){
				currsumA = currsumA + A[i];
				currsumB = currsumB + B[i]; 
			}
			else{
				if(currsumA>currsumB)
					count = count + currsumA;
				else
					count = count + currsumB;
				currsumA=A[i];
				currsumB=B[i];
			}
		}
		if(currsumA>currsumB)
			count = count + currsumA;
		else
			count = count + currsumB;
		System.out.println(count);
		/*if(A[0]>B[0]){
			count=A[0];
			flag=1;
		}
		else{
			count=B[0];
			flag=2;
		}
		for(int i=1;i<n;i++){
			if(A[i]!=B[i]){
				if(flag==1)
					count = count + A[i];
				else if(flag==2)
					count = count + B[i];
			}
			else{
				if(i==n-1){
					count = count + A[i];
				}
				else{
					if(A[i+1]>B[i+1]){
						flag=1;
						count = count + A[i];
					}
					else{
						flag=2;
						count = count + B[i];
					}
				}
			}

		}
		System.out.println(count);*/
    }
}
