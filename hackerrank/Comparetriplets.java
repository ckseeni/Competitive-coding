import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Comparetriplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int a0=in.nextInt();
		int a1=in.nextInt();
		int a2=in.nextInt();
		int b0=in.nextInt();
		int b1=in.nextInt();
		int b2=in.nextInt();
		int[] arrA = new int[1];
		int[] arrB = new int[1];
		if(a0>b0)
			arrA[0]=arrA[0]+1;
		else if(a0<b0)
			arrB[0]=arrB[0]+1;
		if(a1>b1)
			arrA[0]=arrA[0]+1;
		else if(a1<b1)
			arrB[0]=arrB[0]+1;
		if(a2>b2)
			arrA[0]=arrA[0]+1;
		else if(a2<b2)
			arrB[0]=arrB[0]+1;
		System.out.println(arrA[0]+" "+arrB[0]);
    }
}
