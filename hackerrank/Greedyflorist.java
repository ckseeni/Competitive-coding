/* Sample program illustrating input/output methods */
import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int k = in.nextInt();
      int arr[] = new int[n];
	  int flag[] = new int[n];
      for(int i=0; i<n; i++){
         arr[i] = in.nextInt();
      }
      int result = 0;
	  Arrays.sort(arr);
	  for(int i=0;i<k;i++){
		int c = 0;
	  	for(int j=n-1-i;j>=0;j=j-k){
			result = result + (c+1)*arr[j];
			c++;	
		}
	  }	 
      System.out.println( result );
      
   }
}

