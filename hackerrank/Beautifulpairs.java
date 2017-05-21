import java.util.*;
import java.io.*;
public class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int flaga[] = new int[n];
		int flagb[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		for(int i=0;i<n;i++)
			b[i] = in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]==b[j]&&flaga[i]==0&&flagb[j]==0){
					flaga[i]=1;
					flagb[j]=1;
					count++;
					break;
				}
			}
		}
		int flag=0;
		for(int i=0;i<n;i++){
			flag=0;
			for(int j=0;j<n;j++){
				if(flagb[i]==0&&flaga[j]==0){
					count++;
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			System.out.println(count-1);
		else
			System.out.println(count);
	}
}
