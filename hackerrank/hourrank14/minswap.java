import java.io.*;
import java.util.*;
public class Minswap {
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int arr[] = new int[n];
			HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
				h.put(arr[i],i);
			}
			Arrays.sort(arr);
			for(int i=0;i<n;i++)
				arr[i]=(int)h.get(arr[i]);
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
	}
}
