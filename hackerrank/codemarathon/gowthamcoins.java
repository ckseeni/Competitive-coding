import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S {
    public static BigInteger fact(int num)
    {
        BigInteger fact= BigInteger.valueOf(1);
        for(int i=1; i<=num; i++)
        {
			BigInteger ii = BigInteger.valueOf(i);
            fact = fact.multiply(ii);
        }
        return fact;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            BigInteger res= BigInteger.valueOf(0);
			int cpy = n;
            for(int i=0;i<=cpy/2;i++){
				if(i>(cpy-i))
					break;
				BigInteger denominator = fact(i);
				denominator = denominator.multiply(fact(n-i));
				BigInteger s = fact(n).divide(denominator);
                res=res.add(s) ;
				n--;
            }       
            System.out.println(res);
            t--;   
        }
    }
}
