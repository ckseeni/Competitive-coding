import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int shortestTightArray(int a, int b, int c){
        // Complete this function
        int d = Math.abs(b-a)+1;
        int d2 = Math.abs(c-b);
        return d+d2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = shortestTightArray(a, b, c);
        System.out.println(result);
    }
}

