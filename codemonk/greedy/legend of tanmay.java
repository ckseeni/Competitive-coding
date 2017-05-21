	import java.io.*;
	import java.util.*;
	public class Solution{
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);  //3cases:when min<0-->min=oddnumber mul of small numbers then mul of +venums..
			int t = in.nextInt();  
			while(t>0){		               //max-->evennum mul of small numbers then mul of +venums.
				int n = in.nextInt();                //min==0-->min=0,max=mulof+venums
				long arr[] = new long[n];            //min>0-->min=smallnum,max==mul of all positivenums
				for(int i=0;i<n;i++)
					arr[i] = in.nextLong();
				if(n==1){
					System.out.println(arr[0]+" "+arr[0]);
					t--;
					continue;
				}
				Arrays.sort(arr);
				//for(int i=0;i<n;i++)
					//System.out.print(arr[i]+" ");
				long min =1;
				long max=1;
				if(arr[0]==0){
					min=0;
					int f=1;
					for(int i=1;i<n;i++){
						if(arr[i]!=0){
							max=max*arr[i];
							f=0;
						}
					}
					if(f==1)
						max=0;
				}
				if(arr[0]>0){
					min=arr[0];
					for(int i=0;i<n;i++)
						max=max*arr[i];
				}
				if(arr[0]<0){
					int count = 0;
					for(int i=0;i<n;i++){
						if(arr[i]<0)
							count++;	
					}
					if(count%2==0){
						for(int i=0;i<count-1;i++)
							min=min*arr[i];
						for(int i=count;i<n;i++){
								if(arr[i]!=0)
									min=min*arr[i];
						}
						int f=1;
						for(int i=0;i<n;i++){
								if(arr[i]!=0){
									max=max*arr[i];
									f=0;
								}
						}
						if(f==1)
							max=0;
					}
					else{
						for(int i=0;i<n;i++){
							if(arr[i]!=0)
								min=min*arr[i];
						}
						int f=1;
						for(int i=0;i<count-1;i++){
							max=max*arr[i];
							f=0;
						}
						for(int i=count;i<n;i++){
								if(arr[i]!=0){
									max=max*arr[i];
									f=0;
								}
						}
						if(f==1)
							max=0;
					}
				}
			
				System.out.println(max+" "+min);
				t--;
			}
		}
	}
