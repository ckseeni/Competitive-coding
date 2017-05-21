import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonaccibigint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int n = in.nextInt();
		BigInteger tt1 = BigInteger.valueOf(t1);
		BigInteger tt2 = BigInteger.valueOf(t2);
		BigInteger tn;
		if(t1>=0&&t1<=2&&t2>=0&&t2<=2&&n>=3&&n<=20){
			tn= BigInteger.valueOf(0);
			for(int i=3;i<=n;i++){
				tn= BigInteger.valueOf(0);
				BigInteger ex = BigInteger.valueOf(1);
				ex=ex.multiply(tt2);
				ex=ex.multiply(tt2);
				tn = tn.add(ex);
				tn = tn.add(tt1);
				tt1=tt2;
				tt2=tn;
			}
			System.out.println(tn);
		}
    }
}
