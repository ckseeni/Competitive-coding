import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int sum(int num){
		int re = 0;
		while(num>0){
			int rem = num%10;
			num=num/10;
			re = re+rem;
		}	
		return re;
	}
	
	public static int best(int num1,int num2){
		int sum1 = sum(num1);
 		int sum2 = sum(num2);
		int bestnum=0;
		if(sum1==sum2){
			if(num1<num2)
				return num1;
			else
				return num2;
		}
		if(sum1>sum2)
			return num1;
		return num2;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		if(n==0){
			System.out.println(n);
			return;
		}
		if(n==1){
			System.out.println(n);
			return;
		}
		int div[] = new int[n];
		div[0]=1;
		int k=1;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				div[k]=i;
				k++;
			}
		}
		div[k]=n;
		k++;
		int bestnum = 0;
		for(int i=0;i<k;i++)
			bestnum = best(bestnum,div[i]);
		System.out.println(bestnum);	
    }
}

