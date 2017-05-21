import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int tarr[] = new int[n];
		for(int i=0;i<n;i++)
			tarr[i]=in.nextInt();
		int index=1,result=0;
		for(int i=0;i<n;i++){
			int count=1,cpk=k;
			while(count<=tarr[i]){
				if(count>cpk){
					index++;
					cpk=cpk+k;
					//System.out.println("new page start + "+count+" and index is "+index);
				}
				if(count==index){
					result++;
					//System.out.println("special one + "+index);
				}
				count++;
			}
			index++;
		}
		System.out.println(result);
    }
}
