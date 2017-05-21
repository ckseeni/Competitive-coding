import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Seg{
		long range1[] = new long[10000000];
		long range2[] = new long[10000000];
		long value[] = new long[10000000];
		long even[] = new long[10000000];
		long odd[] = new long[10000000];
}

public class Solution {
		public static Seg s = new Seg(); 
		public static long treeLength = 0;
		public static long n=0,oddcount=0,evencount=0;

		public static long findOddValue(long p,long i,long r){
			long r1 = s.range1[(int)p];
			long r2 = s.range2[(int)p];
			if(i==r1&&r==r2)
				return s.odd[(int)p];
			if(i<r1||r>r2)
				return 0;
			else
				return findOddValue(2*p,i,r)+findOddValue((2*p)+1,i,r);
		}		

		public static long findEvenValue(long p,long i,long r){
			long r1 = s.range1[(int)p];
			long r2 = s.range2[(int)p];
			if(i==r1&&r==r2)
				return s.even[(int)p];
			if(i<r1||r>r2)
				return 0;
			else
				return findEvenValue(2*p,i,r)+findEvenValue((2*p)+1,i,r);
		}		

		public static void constructTree(long arr[],long l,long r,long p){
			if(l==r){
				s.value[(int)p]=arr[(int)l]%2;
				s.range1[(int)p]=l;
				s.range2[(int)p]=r;	
				if(s.value[(int)p]==0)
					s.even[(int)p]=1;
				else
					s.odd[(int)p]=1;
			}
			else{
				long m = (l+r)/2;
				constructTree(arr,l,m,(2*p));
				constructTree(arr,m+1,r,((2*p)+1));
				s.range1[(int)p]=l;
				s.range2[(int)p]=r;
				s.even[(int)p]=s.even[(int)(2*p)]+s.even[(int)((2*p)+1)];	
				s.odd[(int)p]=s.odd[(int)(2*p)]+s.odd[(int)((2*p)+1)];
			}
		}

		public static void updateTree(long arr[],long p,long index){
			long l = s.range1[(int)p];
			long r = s.range2[(int)p];
			if(index<l||index>r)
				return;
			if(l==r&&l==index){
				s.value[(int)p]=arr[(int)index]%2;
				s.even[(int)p]=0;
				s.odd[(int)p]=0;
				if(s.value[(int)p]==0)
					s.even[(int)p]=1;
				else
					s.odd[(int)p]=1;
			}
			else{
				updateTree(arr,2*p,index);
				updateTree(arr,(2*p)+1,index);
				s.even[(int)p]=s.even[(int)(2*p)]+s.even[(int)((2*p)+1)];	
				s.odd[(int)p]=s.odd[(int)(2*p)]+s.odd[(int)((2*p)+1)];
			}
		}

	    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		long arr[] = new long[(int)n];
		for(int i=0;i<n;i++)
			arr[i] = in.nextLong();
		constructTree(arr,0,n-1,1);
		int q = in.nextInt();
		while(q>0){
			char type = in.next().charAt(0);
			if(type=='V'){
				long i = in.nextLong();
				long r = in.nextLong();
				oddcount=findOddValue(1,i,r);
				evencount=findEvenValue(1,i,r);
				BigInteger o = BigInteger.valueOf(oddcount);
				BigInteger e = BigInteger.valueOf(evencount);
				BigInteger c = BigInteger.valueOf(r-i+1);
				BigInteger c1 = BigInteger.valueOf(r-i);
				BigInteger two = BigInteger.valueOf(2);
				c=c.multiply(c1);
				c=c.divide(two);
				o=o.multiply(e);
				c=c.subtract(o);
				System.out.println(c);
			}
			else if(type=='U'){
				long i = in.nextLong();
				long e = in.nextLong();
				arr[(int)i]=e;
				updateTree(arr,1,i);
			}
			q--;
		} 
    }
}
