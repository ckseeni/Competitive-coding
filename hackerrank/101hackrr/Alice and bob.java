import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int baseprimes[],n,count=0;
	
	public static void strikeout(int p){
		int i = p+baseprimes[p];
		for(;i<=n;i=i+baseprimes[p])
			baseprimes[i]=-1;
	}	

	public static void base(){
		int k=0;
		for(int i=2;i<=n;i++)
			baseprimes[k++]=i;
		for(int i=0;i<k;i++){
			if(baseprimes[i]!=-1)
				strikeout(i);
		}	
		for(int i=0;i<k;i++){
			//System.out.print(baseprimes[i]+" ");
			if(baseprimes[i]!=-1)
				count++;
		}	
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            n = in.nextInt();
            baseprimes = new int[n+1];
			base();
			if(count%2==0)
				System.out.println("Bob");
			else
				System.out.println("Alice");
			count = 0;
        }
    }
}

