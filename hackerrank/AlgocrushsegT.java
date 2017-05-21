import java.util.*;
import java.io.*;
public class Solution{
	long st[];

	Solution(long arr[],int n){
		int maxsize;
		int x = (int)Math.ceil(Math.log(n)/Math.log(2));
		maxsize = 2*(int)(Math.pow(2,x))-1;
		st = new long[maxsize];
		constructUtil(arr,0,n-1,0);
	}

	long constructUtil(long arr[],int ss,int se,int si){
		if(ss==se){
			st[si]=arr[ss];
			return arr[ss];
		}
		int mid = ss+((se-ss)/2);
		st[si] = (long)Math.max(constructUtil(arr,ss,mid,si*2+1),constructUtil(arr,mid+1,se,si*2+2));
		return st[si];
	}

	void updateValue(long arr[],int n,int qs,int qe,long newvalue){
		updateValueUtil(0,n-1,qs,qe,newvalue,0,arr);
	}

	long updateValueUtil(int ss,int se,int qs,int qe,long newvalue,int si,long arr[]){
		if(qs<=ss&&qe>=se)
			return st[si];
		if(qs>se||qe<ss)
			return 0;
		else{
			int mid = ss+((se-ss)/2);
			st[si]=(long)Math.max(updateValueUtil(ss,mid,qs,qe,newvalue,si*2+1,arr),updateValueUtil(mid+1,se,i,newvalue,si*2+2,arr));
			return st[si];
		}
		/*if(i<ss||i>se)
			return 0;
		if(i==ss&&i==se){
			st[si]=st[si]+newvalue;
			return st[si];
		}
		else{
			int mid = ss+((se-ss)/2);
			st[si]=(long)Math.max(updateValueUtil(ss,mid,i,newvalue,si*2+1,arr),updateValueUtil(mid+1,se,i,newvalue,si*2+2,arr));
			return st[si];
		}*/
	}
	
	long getMaxUtil(int ss,int se,int qs,int qe,int si){
		if(qs<=ss&&qe>=se)
			return st[si];
		if(qs>se||qe<ss)
			return 0;
		int mid = ss+((se-ss)/2);	
		long max = (long)Math.max(getMaxUtil(ss,mid,qs,qe,si*2+1),getMaxUtil(mid+1,se,qs,qe,si*2+2));
		return max;
	}
	
	long getMax(int n,int qs,int qe){
		return getMaxUtil(0,n-1,qs,qe,0);
	}
		
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long arr[] = new long[n];
		Solution s = new Solution(arr,n);
		while(m>0){
			int a = in.nextInt();
			int b = in.nextInt();
			long newvalue = in.nextLong();
			s.updateValue(arr,n,i1,i2,newvalue);
			m--;
		}
		System.out.println(s.st[0]);
	}
}
