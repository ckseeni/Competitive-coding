import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
		int f=0,s=0;
        if(time.charAt(time.length()-2)=='P'){
			f=(int)time.charAt(0)-48;
			s=(int)time.charAt(1)-48;
			int num = (f*10+s);
			if(num==12)
				System.out.print("12");
			else{
				num=num+12;
				System.out.print(num);
			}
			for(int i=2;i<time.length()-2;i++)
				System.out.print(time.charAt(i));	
		}
		else{
			f=(int)time.charAt(0)-48;
			s=(int)time.charAt(1)-48;
			int num = (f*10+s);
			if(num==12)
				System.out.print("00");
			else{ 
				if(num<10)
					System.out.print("0");
				System.out.print(num);
			}
			for(int i=2;i<time.length()-2;i++)
				System.out.print(time.charAt(i));	
		}            
    }
}

