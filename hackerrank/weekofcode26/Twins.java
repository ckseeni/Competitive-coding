import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int baseprimes[];
	
	public static int strikeout(int p){
		for(int i=2*p;i<=m;i=i+p)
			baseprimes[i]=-1;
	}	

	public static int base(int n){
		int k=0;
		for(int i=2;i<=m;i++)
			baseprimes[k++]=i;
		for(int i=0;i<k;i++){
			if(baseprimes[i]!=-1)
				strikeout(baseprimes[i]);
		}	
		for(int i=0;i<k;i++)
			System.out.print(baseprimes[i]+" ");	
	}

	public static int check(int n){
		for(int i=2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0)
				return 0;
		}
		return 1;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int prime[] = new int[m-n];
		int k = 0;
		baseprimes = new int[m];
		base(m);
		/*for(int i=n;i<=m;i++){
			if(check(i)==1){
				//System.out.println(i);
				prime[k]=i;
				k++;	
			}
		}	*/	
		int flag[] = new int[2*(m-n)];
		int count=0;	
		for(int i=0;i<k;i++){
			for(int j=i;j<k;j++){
				if(flag[i+j]==0){
					if(Math.abs(prime[i]-prime[j])==2){
						count++;
						flag[i+j]=1;
					}
				}	
			}
		}	
		System.out.println(count);
    }
}

