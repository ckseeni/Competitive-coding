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
			int flag=0,ans=1;
			if(n%2!=0){
				n=n-1;
				flag=1;
			}
			for(int i=1;i<=n;i=i+2){
				ans=ans+ans;
				ans++;			
			}
			if(flag==1)
				ans=ans+ans;
			System.out.println(ans);
        }
    }
}

