import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
			int[] arr = new int[n];
			if(n<5){
				if(n%3==0)
					System.out.println("555");
				else
					System.out.println("-1");
			}
			else if(n%3==0){
				for(int k=0;k<n;k++)
					System.out.print("5");
				System.out.println();
			}
			else{
				int first=n-5;
				while(first%3!=0)
					first=first-5;
				if(first<0)
					System.out.println("-1");
				else{
					int k=0;
					for(;k<first;k++)
						arr[k]=5;			
					for(;k<n;k++)
						arr[k]=3;
					for(k=0;k<n;k++)
						System.out.print(arr[k]);
					System.out.println();	
				}	
			}
        }
    }
}

