import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static int max(int arr[],int arr1[],int index[],int n){
		int maxIndex=-1,maxValue=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(index[i]==0&&arr[i]>maxValue){
				maxIndex=i;
				maxValue=arr[i];
			}
		}
		int maxIndex1=-1,maxValue1=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(index[i]==0&&arr1[i]>maxValue1){
				maxIndex1=i;
				maxValue1=arr1[i];
			}
		}
		if(arr[maxIndex]<arr1[maxIndex1])
			return maxIndex1;
		else
			return maxIndex;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int A[] = new int[n];
			for(int i=0;i<n;i++)
				A[i] = in.nextInt();
			int B[] = new int[n];
			for(int i=0;i<n;i++)
				B[i] = in.nextInt();
			int index[] = new int[n];
			int Apoint=0,Bpoint=0;
			for(int i=0;i<n;i++){
				if(i%2==0){
					int maxIndex = max(A,B,index,n);
					index[maxIndex]=1;
					Apoint = Apoint+A[maxIndex];		
				}
				else{
					int maxIndex = max(B,A,index,n);
					index[maxIndex]=1;
					Bpoint = Bpoint+B[maxIndex];
				}
			}
			if(Apoint==Bpoint)
				System.out.println("Tie");
			else if(Apoint>Bpoint)
				System.out.println("First");
			else if(Apoint<Bpoint)
				System.out.println("Second");
			t--;
		}
    }
}
