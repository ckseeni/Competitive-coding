import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//9687: 9 6 8  7 96 98 97 68 67 87 968  967 987 687 
public class Maximal {

   /* public static BigInteger c = BigInteger.valueOf(0);
	public static BigInteger z = BigInteger.valueOf(0);
	public static BigInteger one = BigInteger.valueOf(1);
	public static BigInteger e = BigInteger.valueOf(8);*/
	public static long max = Long.MIN_VALUE,c = 0;
	public static HashMap<Long,Long> h = new HashMap<Long,Long>();
	public static void subset(long[] A,int k,int start,int currLen,boolean[] used) {
		if(currLen==k) {
			int f=0;
			long t = 0;
			for(int i=0; i<A.length; i++) {
				if(used[i]==true&&f==1) {
					//System.out.print(A[i]+"");
					;
					t = t & A[i];
				}
				else if(used[i]==true)
						t = A[i];
			}
			/*String ss = s.toString();
			BigInteger a = new BigInteger(ss);
			BigInteger r = a.mod(e);*/
			
			if(t>max){
				max = t;
				if(h.containsKey(t)){
					long count = h.get(t);
					count = count + 1;
					count = count %(Math.pow(10,9)+7);
					h.put(t,count);
				}
				else
					h.put(t,1);
				//System.out.println(a);
			}
			//System.out.println();
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
		int k = in.nextInt();
		long A[] = new long[n];
		for(int i=0;i<n;i++)
			A[i] = in.nextLong();
		boolean[] B=new boolean[A.length];
		
		subset(A,k,0,0,B);
		//maximum(A,k,0,0,B);
		
		//BigInteger seven = BigInteger.valueOf(7);
		//BigInteger m = BigInteger.valueOf((long)Math.pow(10,9));
		//m = m.add(seven);
		System.out.println(max);
		System.out.println(h.get(max));
	}
    
}

