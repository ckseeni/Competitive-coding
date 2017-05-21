import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static BigInteger factorial(int n){
		BigInteger res = BigInteger.ONE;
		for(int i=1;i<=n;i++){
			BigInteger iv = BigInteger.valueOf(i);
			res = res.multiply(iv);
		}
		return res;
	}   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       	int n = in.nextInt();
		int k = in.nextInt();
		long A[] = new long[n];
		String arr[] = new String[n];
		int maxLength = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			A[i] = in.nextLong();
			arr[i] = Long.toString(A[i],2);
			if(arr[i].length()>maxLength)
				maxLength = arr[i].length();
		}
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0;i<n;i++){
			if(arr[i].length()<maxLength){
				StringBuffer s = new StringBuffer();
				int d = maxLength - arr[i].length();
				for(int j=0;j<d;j++)
					s.append("0");
				s.append(arr[i]);
				arr[i] = s.toString();
					
			}
			a.add(arr[i]);
		}
		//for(int i=0;i<a.size();i++)
		//	System.out.println(a.get(i));		
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<maxLength;i++){
			int l=0;
			int count = 0;
			ArrayList<String> b = new ArrayList<String>();
			for(int j=0;j<a.size();j++){
				if(a.get(j).charAt(i)=='1'){
					count++;
					b.add(a.get(j));
				}
			}
			if(count>=k){
				a = new ArrayList<String>(b);
				buf.append("1");
			}
			else{
				buf.append("0");
			}
		}
		Long and = Long.parseLong(buf.toString(),2);
		System.out.println(and);
		//for(int i=0;i<a.size();i++)
		//	System.out.println(a.get(i));
		BigInteger nfact = factorial(a.size());
		//System.out.println(nfact);
		BigInteger nrfact = factorial(a.size()-k);
		//System.out.println(nfact);		
		BigInteger rfact = factorial(k);
		//System.out.println(nfact);
		nrfact = nrfact.multiply(rfact);
		BigInteger m = BigInteger.valueOf((long)(Math.pow(10,9)+7));
		//nrfact = nrfact.mod(m);
		nfact = nfact.divide(nrfact);
		nfact = nfact.mod(m);
		System.out.println(nfact);
    }
}

