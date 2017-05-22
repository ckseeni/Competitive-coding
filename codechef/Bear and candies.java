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
			int A = in.nextInt();
			int B = in.nextInt();
			int n = (int)Math.ceil(Math.sqrt(A));
			int oddsum = n*n; //formula for finding 1st n odd consecutive sum
			int evensum = n*n + n; //formula for finding 1st n even consecutive sum
			//System.out.println(oddsum+" "+evensum);
			String res = "";
			while(true){
				if(oddsum<=A&&evensum>B){
					res = "Limak";
					break;
				}
				else if(evensum<=B&&oddsum>A){
					res = "Bob";
					break;
				}
				else if(oddsum==A&&evensum==B){
					res = "Bob";
					break;
				}
				else{
					n--;
					oddsum = n*n;
					evensum = n*n + n;
				}
			}
			System.out.println(res);
			t--;
		}
		
    }
}

