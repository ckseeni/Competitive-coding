import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
			int container = 0,k=0;
			int c[] = new int[n];
			for(int j=0;j<n;j++){
				for(int i=0;i<n;i++)
					container = container+M[i][j];
				c[k++] = container;
				container = 0;
			}
			int ball = 0,l=0;;
			int b[] = new int[n];
			for(int j=0;j<n;j++){
				for(int i=0;i<n;i++)
					ball = ball+M[j][i];
				b[l++] = ball;
				ball = 0;
			}
			Arrays.sort(c);
			Arrays.sort(b);
			int i=0;
			for(i=0;i<n;i++){
				if(c[i]!=b[i])
					break;
			}
			if(i==n)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
            // your code goes here
        }
    }
}
David has containers and different types of balls, both of which are numbered from to . The distribution of ball types per container are described by an matrix of integers, , where each is the number of balls of type in container . For example, consider the following diagram for :

image

In a single operation, David can swap two balls located in different containers (i.e., one ball is moved from container to and the other ball is moved from to ).

For example, the diagram below depicts a single swap operation:

image

David wants to perform some number of swap operations such that both of the following conditions are satisfied:

    Each container contains only balls of the same type.
    No two balls of the same type are located in different containers.
Ans:


As the operations only allow us to swap balls between two containers, each container will contain a fixed number of balls all the time. Suppose the container always contains number of balls. Each can be calculated by finding the sum of row in matrix .

Let denotes the number of balls of color . Each can be calculated by finding the sum of column in matrix .

Let's think about container and ball of type . As container will always contain number of balls, ball of type can fit in container only of .

Now for each you have to find a suitable container such that . If you can find such container for each balls, it's possible to obtain the desired configuration. It can be done by simply sorting the array and . After sorting check if the arrays are exactly same or not. If the arrays are same, it's possible to obtain the desired configuration, otherwise it's impossible.

