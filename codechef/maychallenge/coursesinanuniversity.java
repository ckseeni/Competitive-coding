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
			int arr[] = new int[n];
			int c[] = new int[n+1];
			for(int i=0;i<n;i++)
				arr[i] = in.nextInt();
			int p = 0;
			for(int i=0;i<n;i++){
				int d = arr[i];
				//for(int j=1;j<=d;j++)
				//	c[j] = 1;
				if(p<d)
					p=d;
			}
			/*int count = 0;
			for(int i=1;i<=n;i++){
				if(c[i]==0)
					count++;
			}*/
			System.out.println(n-p);
			t--;
		}
    }
}


