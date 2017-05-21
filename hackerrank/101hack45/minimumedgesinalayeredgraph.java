import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
		if(k>n){
			System.out.println("-1");
			return;
		}
		if(k==n){
			System.out.println(n-1);
			return;
		}
		if(k==2&&n>2){
			System.out.println("-1");
			return;
		}
		if(n-k==1){
			System.out.println(k+1);
			return;
		}
		if(n-k==2){
			System.out.println(k+2);
			return;
		}
		System.out.println(k-1+2*(n-k));
		/*int d = n-k;
		int fib[] = new int[d];
		fib[0]=1;
		fib[1]=2;
		for(int i=2;i<d;i++)
			fib[i]=fib[i-1]+fib[i-2];
		if(n%2==0)
			System.out.println(k+fib[d-1]+1);
		else
			System.out.println(k+fib[d-1]-1);*/
    }
}
/*Observation 1

If the number of layers is , this means that our layers are composed of only the first and last layer. Our rules state that the first and last layer can only contain vertex each, so our graph is only possible with layers if the number of vertices is also . Any other value of is not possible.
Observation 2

If there are more layers than we have vertices, then we can't possibly place vertex on each layer. This means that this kind of graph is also impossible.
Observation 3

This leaves us with two remaining cases:

    The number of vertices and layers are the same.
    The number of vertices is more than the number of the layers such that the number of layers is not .

Solution

If and are equal, then the number of edges will be because we'll put a single vertex on each layer and each layer will have an edge leading to the next (except for the final layer). If is greater than and is not , we'll have a vertex on each layer, giving us edges. Next, we'll want to place the remaining edges in one of the middle layers (not the first or last); to do this, we'll need two edges to connect each of those vertices to the graph. This gives us the final formula of:

Note that this formula also works when and are equal.*/
