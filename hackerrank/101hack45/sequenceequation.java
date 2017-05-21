import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int arr[] = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i] = in.nextInt();
		for(int x=1;x<=n;x++){
			int val = x;
			for(int i=1;i<=n;i++){
				if(val==arr[i]){
					val=i;
					break;
				}	
			}
			for(int i=1;i<=n;i++){
				if(val==arr[i]){
					val=i;
					break;
				}	
			}
			System.out.println(val);			
		}
    }
}


