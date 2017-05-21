import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("..O..");
		arr.add("O.o.O");
		arr.add("..O..");
		for(int i=0;i<r;i++){
			for(int k=0;k<3;k++){
				for(int j=0;j<c;j++){
					System.out.print(arr.get(k));
				}
				System.out.println();
			}
		}
        // your code goes here
    }
}

