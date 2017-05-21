import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int tot[] = {31,28,31,30,31,30,31,31,30,31,30};
		int totl[] = {31,29,31,30,31,30,31,31,30,31,30};
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("Jan",0);
		h.put("Feb",1);
		h.put("Mar",2);
		h.put("Apr",3);
		h.put("May",4);
		h.put("Jun",5);
		h.put("Jul",6);
		h.put("Aug",7);
		h.put("Sept",8);
		h.put("Oct",9);
		h.put("Nov",10);
		String mon = in.next();
		int date = in.nextInt();
		int year = in.nextInt();
		if(mon.equals("Dec")){
			if(date<=25)
				System.out.println(25-date);
			else{
				int next = year+1;
				if(next%4==0){
					int diff = 25-date;
					System.out.println(366+diff);
				}
				else{
					int diff = 25-date;
					System.out.println(365+diff);
				}
			}
		}
		else{
			if(year%4!=0){
				int total = 0;
				int index = h.get(mon);
				for(int i=index;i<tot.length;i++)
					total = total+tot[i];
				//System.out.println(total);
				//for(int i=0;i<index;i++)
				//	total=total-tot[i];
				total = total-date;
				System.out.println(total+25);
			}
			else{
				
				int total = 0;
				int index = h.get(mon);
				for(int i=index;i<totl.length;i++)
					total = total+totl[i];
				//System.out.println(total);
				//for(int i=0;i<index;i++)
				//	total=total-totl[i];
				total = total-date;
				if(year%100!=0)
					System.out.println(total+25);
				else{
					if(year%400==0)
						System.out.println(total+25);
					else
						System.out.println(total+24);
				}
				
			}
		}
    }
}
