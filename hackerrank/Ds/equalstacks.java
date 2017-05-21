import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int check(int arr[],int sum,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==sum)
                return 1;
        }
        return 0;
    }
    public static int[] reverse3(int[] nums) {
    int[] reversed = new int[nums.length];
    for (int i=0; i<nums.length; i++) {
        reversed[i] = nums[nums.length - 1 - i];
    }
    return reversed;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        h1 = reverse3(h1);
        h2  =reverse3(h2);
        h3 = reverse3(h3);
        int fsum[] = new int[n1];
        fsum[0]=h1[0];
        for(int i=1;i<n1;i++)
            fsum[i] = fsum[i-1]+h1[i]; 
       
        int ssum[] = new int[n2];
        int scsum[] = new int[n2];
        ssum[0]=h2[0];
        int k=0;
        for(int i=1;i<n2;i++){
            int sum = ssum[i-1]+h2[i];
            ssum[i]=sum;
            if(check(fsum,sum,n1)==1){
                scsum[k] = sum;    
                k++;
            }
        }
        int tsum[] = new int[n3];
        int j = 0;
        int tcsum[] = new int[n3];
		tsum[0]=h3[0];
		if(n1==n2&&n2==n3&&n1==1){
			System.out.println(h1[0]);
			return;
		}
        for(int i=1;i<n3;i++){
            int sum = tsum[i-1]+h3[i];
            tsum[i]=sum;
            if(check(scsum,sum,k)==1){
                tcsum[j]=sum;
                j++;
            }
        }
       	int max = -1;
		/*for(int i=0;i<n3;i++){
			if(tcsum[i]>max)
				max=tcsum[i];
		}*/
		Arrays.sort(tcsum);
		System.out.println(tcsum[j]);
    }
}

