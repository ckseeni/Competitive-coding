import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gang{
	public static int findroot(int index[],int num){
		while(index[num]!=num){
			num = index[num];
		}
		return num;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		long arr[] = new long[n];
		int index[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextLong();
			index[i]=i;
		}
		while(q>0){
			int x = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int roota = findroot(index,a);
			int rootb = findroot(index,b);
			long resultE = 0,sum=0;
			if(x==2){
				resultE =(long) Math.abs(arr[roota]-arr[rootb]);
				System.out.println(resultE);
			}
			else if(x==1){
				if(roota!=rootb){
					sum = arr[roota]+arr[rootb];
					arr[rootb]=sum;
					index[roota]=rootb;
				}
			}
			q--;
		}
    }
}
