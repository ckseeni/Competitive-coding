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
		int order[] = new int[n+1];
		int finish[] = new int[n+1];
		for(int i=0;i<n;i++){
			int t = in.nextInt();
			int d = in.nextInt();
			order[i+1]=i+1;
			finish[i+1]=t+d;
		}
		for(int i=1;i<n;i++){
			for(int j=i+1;j<=n;j++){
				if(finish[i]>finish[j]){
					int temp=finish[i];
					finish[i]=finish[j];
					finish[j]=temp;
					temp=order[i];
					order[i]=order[j];
					order[j]=temp;
				}
				else if(finish[i]==finish[j]){
					if(order[i]>order[j]){
						int temp=order[i];
						order[i]=order[j];
						order[j]=temp;
					}	
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(order[i+1]+" ");
    }
}
