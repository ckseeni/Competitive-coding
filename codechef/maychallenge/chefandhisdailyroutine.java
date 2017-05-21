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
			String s = in.next();
			int count[] = new int[10000];
			int k = 0;
			count[k++] = (int)s.charAt(0);
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)!=s.charAt(i+1))
					count[k++] = (int)s.charAt(i+1);	
			}
			int i=0;
			for(i=0;i<k-1;i++){
				if(count[i]>count[i+1])
					break;
			}
			if(i==k-1)
				System.out.println("yes");
			else
				System.out.println("no");
			t--;
		}
    }
}


