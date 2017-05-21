import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		int indexA[] = new int[10000];
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<n;i++){
			A[i] = in.nextInt();
			indexA[A[i]] = indexA[A[i]] + 1;
		}
		int m = in.nextInt();
		int B[] = new int[m];
		int indexB[] = new int[10000];
		for(int i=0;i<m;i++){
			B[i] = in.nextInt();
			indexB[B[i]] = indexB[B[i]]+1;
		}
		for(int i=0;i<m;i++){
			if(indexB[B[i]]!=indexA[B[i]])
				h.add(B[i]); 
		}
		ArrayList<Integer> arr = new ArrayList(h);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
    }
}
