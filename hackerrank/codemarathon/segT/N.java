import java.text.*;
import java.math.*;
import java.util.*;

class SegmentTree{
	int st[];
	SegmentTree(int arr[],int n){
		int x = (int) (Math.ceil(Math.log(n)/ Math.log(2)));
		int max_size =2* (int) Math.pow(2, x) -1;
		st =new int[max_size];
		constructSTUtil(arr,0, n -1,0);
	}
	int getMid(int s,int e) {
		return s + (e - s) /2;
	}
	int getSumUtil(int ss,int se,int qs,int qe,int si){
		if(qs <= ss && qe >= se)
			return st[si];
		if(se < qs || ss > qe)
			return 0;
		int mid = getMid(ss, se);
		return getSumUtil(ss, mid, qs, qe,2* si +1) +getSumUtil(mid +1, se, qs, qe,2* si +2);
	}
	void updateValueUtil(int ss,int se,int i,int diff,int si){
		if(i < ss || i > se)
			return;
		st[si] = st[si] + diff;
		if(se != ss) {
			int mid = getMid(ss, se);
			updateValueUtil(ss, mid, i, diff,2* si +1);
			updateValueUtil(mid +1, se, i, diff,2* si +2);
		}
	}
	void updateValue(int arr[],int n,int i,int new_val){
		if(i <0|| i > n -1) {
			System.out.println("Invalid Input");
			return;
		}
		int diff = new_val - arr[i];
		arr[i] = new_val;
		updateValueUtil(0, n -1, i, diff,0);
	}
	int getSum(int n,int qs,int qe){
		if(qs <0|| qe > n -1|| qs > qe) {
			System.out.println("Invalid Input");
			return-1;
		}
		return getSumUtil(0, n -1, qs, qe,0);
	}
	int constructSTUtil(int arr[],int ss,int se,int si){
		if(ss == se) {
			st[si] = arr[ss];
			return arr[ss];
		}
		int mid = getMid(ss, se);
		st[si] = constructSTUtil(arr, ss, mid, si *2+1) +constructSTUtil(arr, mid +1, se, si*2+2);
		return st[si];
	}
	public static void main(String args[]){
		Scanner in  = new Scanner (System.in);
		ArrayList<BigInteger> ar = new ArrayList<BigInteger>();
        int n=in.nextInt();
		int[] arr = new int[n];
		int oc[] = new int[n];
		int ec[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]%2==0){
				ec[i]=1;
				oc[i]=0;
			}else{
				oc[i]=1;
				ec[i]=0;
			}
		}
		SegmentTree tree1 =new SegmentTree(oc,n);
		SegmentTree tree2 =new SegmentTree(ec,n);
		int q = in.nextInt();
		for(int i=0;i<q;i++){
			String str = in.next();
			char a= str.charAt(0);
			int l = in.nextInt();
			int r = in.nextInt();
			if(a=='V'){
				int ocount=0,ecount=0;
				ocount=tree1.getSum(n,l,r);
				ecount=tree2.getSum(n,l,r);
				//System.out.println(ocount);
				//System.out.println(ecount);
				BigInteger odd=BigInteger.valueOf(ocount);
				BigInteger even=BigInteger.valueOf(ecount);
				BigInteger n1=BigInteger.valueOf(r-l+1);
				BigInteger n2=BigInteger.valueOf(r-l);
				BigInteger two=BigInteger.valueOf(2);
				n1=n1.multiply(n2);
				n1=n1.divide(two);
				odd=odd.multiply(even);
				n1=n1.subtract(odd);
				ar.add(n1);//System.out.println(count);
			}else{
				tree1.updateValue(oc,n,l,o);
				tree2.updateValue(ec,n,l,e);
			}
		
		}
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}
}
