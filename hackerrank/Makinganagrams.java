import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		for(int i=0;i<s1.length();i++){
			int index = (int)(s1.charAt(i)-97);
			arr1[index]=arr1[index]+1;
		}
		for(int i=0;i<s2.length();i++){
			int index = (int)(s2.charAt(i)-97);
			arr2[index]=arr2[index]+1;
		}
		int count=0;
		for(int i=0;i<26;i++){
			if(arr1[i]!=arr2[i])
				count=count+Math.abs(arr1[i]-arr2[i]);
		}
		System.out.println(count);
    }
}
