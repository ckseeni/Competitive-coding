import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
		
		for(int k=1;k<ar.length;k++){	
			int i = k;	
			int temp=ar[i];
			while(i!=0){
				int j=i-1;
				if(ar[j]>=temp){
					ar[i]=ar[j];
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
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

