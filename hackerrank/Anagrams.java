import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			String s = in.next();
			if(s.length()%2!=0)
				System.out.println("-1");
			else{
				StringBuilder one = new StringBuilder(s);
				StringBuilder two = new StringBuilder(s);
				two.delete(0,s.length()/2);
				one.delete(s.length()/2,s.length());
				String s1 = new String(one);
				String s2 = new String(two);
				int count=0;
				int arr1[] = new int[26];
				int arr2[] = new int[26];
				for(int i=0;i<s.length()/2;i++){
					int index = (int)(s1.charAt(i)-97);
					arr1[index]=arr1[index]+1;
					index = (int)(s2.charAt(i)-97);
					arr2[index]=arr2[index]+1;
				}
				for(int i=0;i<26;i++){
					if(arr2[i]!=0&&arr2[i]>arr1[i]){
						count=count+(arr2[i]-arr1[i]);
					}
				}
				System.out.println(count);
			}
			t--;
		}
    }
}
