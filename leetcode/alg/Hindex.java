public class Solution {
    public int countValues(int[] flag,int i){
        int c = 0;
        for(;i>=0;i--){
            if(flag[i]>0)
                c = c+flag[i];
        }
        return c;
    }
    public int hIndex(int[] citations) {
        if(citations.length==0)
            return 0;
        if(citations.length==1&&citations[0]==0)
            return 0;
        if(citations.length==1)
            return 1;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        int flag[] = new int[max+1];
        for(int i=0;i<citations.length;i++)
            flag[citations[i]]=flag[citations[i]]+1;
        int count[] = new int[max+1];
        int sum = 0;
        for(int i=max;i>=0;i--){
            if(flag[i]>0){
                sum = sum + flag[i];
                count[i] = sum;
            }
            //if(flag[i]>0){
                if(sum>=i){
                    int r = citations.length-sum;
                    int c = countValues(flag,i-1);
                    if(r==c)
                        return i;
                }
           // }
        }
        return 0;
    }
}
