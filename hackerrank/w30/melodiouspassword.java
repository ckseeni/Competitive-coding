import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<String> t1 = new ArrayList<String>();
		ArrayList<String> t2 = new ArrayList<String>();
		arr1.add("a");arr1.add("e");arr1.add("i");arr1.add("o");arr1.add("u");
		arr2.add("b");arr2.add("c");arr2.add("d");arr2.add("f");arr2.add("g");
		arr2.add("h");arr2.add("j");arr2.add("k");arr2.add("l");arr2.add("m");
		arr2.add("s");arr2.add("r");arr2.add("q");arr2.add("p");arr2.add("n");
		arr2.add("t");arr2.add("v");arr2.add("w");arr2.add("x");arr2.add("z");
		if(n==1){
			for(int i=0;i<5;i++)
				System.out.println(arr1.get(i));
			for(int i=0;i<20;i++)
				System.out.println(arr2.get(i));
		}
		else{
			t2 = arr2;
			t1 = arr1;
			for(int k=1;k<n;k++){
				ArrayList<String> temp1 = new ArrayList<String>();
				ArrayList<String> temp2 = new ArrayList<String>();
				for(int i=0;i<arr1.size();i++){
					for(int j=0;j<t2.size();j++){
						String s1 = arr1.get(i);
						String s2 = t2.get(j);
						temp1.add(s1+s2);
					}
				}
				for(int i=0;i<arr2.size();i++){
					for(int j=0;j<t1.size();j++){
						String s1 = arr2.get(i);
						String s2 = t1.get(j);
						temp2.add(s1+s2);
					}
				}
				t2 = temp2;
				t1 = temp1;
			}
			for(int i=0;i<t1.size();i++)
				System.out.println(t1.get(i));
			for(int i=0;i<t2.size();i++)
				System.out.println(t2.get(i));
		}
	}
}	
