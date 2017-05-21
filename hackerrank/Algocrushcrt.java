import java.util.*;
import java.io.*;
public class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long arr[] = new long[n+1];
		while(m>0){
			int a = in.nextInt();
			int b = in.nextInt();
			long newvalue = in.nextLong();
			arr[a]=arr[a]+newvalue;
			if(b+1<=n)
				arr[b+1]=arr[b+1]-newvalue;
			m--;
		}
		long max=0,x=0;
		for(int i=1;i<=n;i++){
			x=x+arr[i];
			if(max<x)
				max=x;
		}
		System.out.println(max);
	}

	/*see, you are adding sum to a[p] and adding negative sum at a[q+1]. which make sure that when you add element from a[p] to a[q] sum is added only once and it should be subtracted at a[q+1] as this sum span from p to q only. Rest array element are either 0 or some other input sum. max of addition will be output. refer to above code for p, q, and sum.Instead of storing the actual values in the array, you store the difference between the current element and the previous element. So you add sum to a[p] showing that a[p] is greater than its previous element by sum. You subtract sum from a[q+1] to show that a[q+1] is less than a[q] by sum (since a[q] was the last element that was added to sum). By the end of all this, you have an array that shows the difference between every successive element. By adding all the positive differences, you get the value of the maximum element*/
}
