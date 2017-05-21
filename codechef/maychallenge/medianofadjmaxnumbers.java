import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class chef {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
		while(t>0){
			int n= in.nextInt();
			int arr[] = new int[2*n];
			int cpy[] = new int[2*n];
			for(int i=0;i<2*n;i++)
				arr[i] = in.nextInt();
			Arrays.sort(arr);
			int b[] = new int[n];
			int k=0;
			for(int i=0;i<n;i++){
				cpy[k++] = arr[i];
				cpy[k++] = arr[2*n-i-1];
			}
			for(int i=0;i<2*n;i++)
				arr[i] = cpy[i];
			int j=0;
			for(int i=0;i<2*n;i=i+2)
				b[j++] = Math.max(arr[i],arr[i+1]);
			Arrays.sort(b);
			System.out.println(b[(n-1)/2]);
			for(int i=0;i<2*n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			t--;
		}
    }
}


