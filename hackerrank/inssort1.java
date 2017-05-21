import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
		int i = ar.length-1;
		int temp=ar[i];
		while(i!=0){
			int j=i-1;
			if(ar[j]>=temp){
				ar[i]=ar[j];
				printArray(ar);
				i--;
			}
			else{
				ar[i]=temp;
				printArray(ar);
				break;
			}
		}
		if(i==0){
			ar[i]=temp;
			printArray(ar);
		}
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 

