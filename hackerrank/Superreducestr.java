import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String s = in.next();
		while(true){
			int arr[] = new int[s.length()];
			arr[0]=1;
			for(int i=1;i<s.length();i++){
				if(s.charAt(i)!=s.charAt(i-1))
					arr[i]=1;
				else
					arr[i]=0;
			}
			int i=0;
			int l = s.length();
			for(i=1;i<l;i++){
				if(arr[i]==0){
					StringBuilder t = new StringBuilder(s);
					t.delete(i-1,i+1);
					s = new String(t); 
					break;
				}
			}
			if(s.isEmpty()){
				System.out.println("Empty String");
				break;
			}
			else if(i==l){
				System.out.println(s);
				break;
			}
			
		}
    }
}
