import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Marsexp {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
		String input = in.next();
		String check;
		int length=input.length()/3;
		int i=0,count=0,error=0;
		while(i<length){
			if(!(input.substring(count,count+3)).equals("SOS")){
				check=input.substring(count,count+3);
				if(check.charAt(0)!='S')
					error++;
				if(check.charAt(1)!='O')
					error++;
				if(check.charAt(2)!='S')
					error++;
			}				
			count=count+3;
			i++;
		}
		System.out.println(error);
   }
}
