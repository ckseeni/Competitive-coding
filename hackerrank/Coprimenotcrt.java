import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static int prime[] = new int[10000000];
	public static int k;
	public static void primegen(int n){
		
		k=0;
		for(int i=2;i<n;i++){
			prime[k]=i;
			k++;
		}
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		primegen(n);
		int count=0;
		for(int i=6;i<=n;i++){
			int pindex=k-1;
			for(int m=0;m<k;m++){
				if(prime[m]>i){
					pindex=m-1;
					break;
				}
			}	
			System.out.println();
			for(int z=0;z<k;z++)
				System.out.print(prime[z]+" ");
			System.out.println();
			for(int z=0;z<=pindex;z++)
				System.out.print(prime[z]+" ");
			for(int m=pindex;m>=0;m--){
				for(int o=m-1;o>=0;o--){
					if(prime[m]*prime[o]==i){
						count++;
						System.out.println("pairs are "+prime[m]+" "+prime[o]);
					}
				}
			}
		}
		System.out.println(count);
    }
}

