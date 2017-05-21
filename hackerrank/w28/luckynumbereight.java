import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//9687: 9 6 8  7 96 98 97 68 67 87 968  967 987 687 
public class Solution {

    public static BigInteger c = BigInteger.valueOf(0);
	public static BigInteger z = BigInteger.valueOf(0);
	public static BigInteger one = BigInteger.valueOf(1);
	public static BigInteger e = BigInteger.valueOf(8);
	public static void subset(int[] A,int k,int start,int currLen,boolean[] used) {
		if(currLen==k) {
			StringBuffer s = new StringBuffer();
			for(int i=0; i<A.length; i++) {
				if(used[i]==true) {
					//System.out.print(A[i]+"");
					s.append(A[i]);
				}
			}
			String ss = s.toString();
			BigInteger a = new BigInteger(ss);
			BigInteger r = a.mod(e);
			if(r.compareTo(z)==0){
				c=c.add(one);
				//System.out.println(a);
			}
			System.out.println();
			return;
		}
		if(start==A.length) {
			return;
		}
		//For every index we have two options,//1.. Either we select it, means put true in used[] and make currLen+1
		used[start]=true;
		subset(A, k, start+1, currLen+1, used);
		//2.. OR we dont select it, means put false in used[] and dont increase//currLen
		used[start]=false;
		subset(A, k, start+1, currLen, used);
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String inp = in.next();
		int A[] = new int[n];
		for(int i=0;i<n;i++)
			A[i] = (int)inp.charAt(i)-48;
		boolean[] B=new boolean[A.length];
		for(int i=1;i<=n;i++){
		subset(A,i,0,0,B);
		}
		
		BigInteger seven = BigInteger.valueOf(7);
		BigInteger m = BigInteger.valueOf((long)Math.pow(10,9));
		m = m.add(seven);
		System.out.println(c.mod(m));
	}
    
}

