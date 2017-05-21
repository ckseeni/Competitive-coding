import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//USBvsPS/2
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int u = in.nextInt();
		int p = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i=0;i<m;i++){
			int n = in.nextInt();
			String s = in.next();
			if(s.equals("USB"))
				arr1.add(n);
			else
				arr2.add(n);
		}
		Collections.sort(arr1);
		Collections.sort(arr2);
		long tot = 0;
		int c = 0;
		int i=0,j=0;
		for(i=0;i<arr1.size()&&i<u;i++){
			tot = tot + arr1.get(i);
			c++;
		}
		for(j=0;j<arr2.size()&&j<p;j++){
			tot = tot + arr2.get(j);
			c++;
		}
		for(int k=0;k<b;k++){
			if(i<arr1.size()&&j<arr2.size()){
				if(arr1.get(i)<arr2.get(j)){
					tot = tot + arr1.get(i);
					c++;	
					i++;
				}
				else{
					tot = tot + arr2.get(j);
					c++;
					j++;
				}
			}
			else if(i<arr1.size()&&j>=arr2.size()){
				tot = tot + arr1.get(i);
				c++;	
				i++;
			}
			else if(j<arr2.size()&&i>=arr1.size()){
				tot = tot + arr2.get(j);
				c++;	
				j++;	
			}
		}
		System.out.println(c+" "+tot);
	}
}     

