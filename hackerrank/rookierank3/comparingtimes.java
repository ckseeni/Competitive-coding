import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void timeCompare(String t1, String t2){
        if((t1.charAt(5)=='A'&&t2.charAt(5)=='A')||(t1.charAt(5)=='P'&&t2.charAt(5)=='P')){
            int a = (int)t1.charAt(0)-48;
            int b = (int)t1.charAt(1)-48;
            int h1 = a*10 + b;
            a = (int)t2.charAt(0)-48;
            b = (int)t2.charAt(1)-48;
            int h2 = a*10 + b;
            h1 = h1 % 12;
            h2 = h2 % 12;
            if(h1<h2)
                System.out.println("First");
            else if(h1>h2)
                System.out.println("Second");
            else{
                a = (int)t1.charAt(3)-48;
                b = (int)t1.charAt(4)-48;  
                int m1 = a*10 + b;
                a = (int)t2.charAt(3)-48;
                b = (int)t2.charAt(4)-48;  
                int m2 = a*10 + b;
                 if(m1<m2)
                    System.out.println("First");
                else if(m1>m2)
                    System.out.println("Second");
            }
        }
        else if(t1.charAt(5)=='A'&&t2.charAt(5)=='P'){
                System.out.println("First");
        }
        else if(t1.charAt(5)=='P'&&t2.charAt(5)=='A'){
            System.out.println("Second");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String t1 = in.next();
            String t2 = in.next();
            timeCompare(t1, t2);
            //System.out.println(result);
        }
    }
}

