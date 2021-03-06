public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int tot = (int)Math.pow(2,nums.length);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for(int i=0;i<tot;i++){
            String bin = Integer.toString(i,2);
            StringBuffer b = new StringBuffer();
            int d = nums.length-bin.length();
            for(int k=0;k<d;k++)
                b.append("0");
            b.append(bin);
            bin = b.toString();
            List<Integer> set = new LinkedList<Integer>();
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1')
                    set.add(nums[j]);
            }
            arr.add(set);
        }
        return arr;
    }
}
/*This is an amazing solution.Learnt a lot.Let me try to explain this to those who didn't get the logic.

 Number of subsets for {1 , 2 , 3 } = 2^3 .
 why ? 
case    possible outcomes for the set of subsets
  1   ->          Take or dont take = 2 
  2   ->          Take or dont take = 2  
  3   ->          Take or dont take = 2 

therefore , total = 2*2*2 = 2^3 = { { } , {1} , {2} , {3} , {1,2} , {1,3} , {2,3} , {1,2,3} }

Lets assign bits to each outcome  -> First bit to 1 , Second bit to 2 and third bit to 3
Take = 1
Dont take = 0
 
0) 0 0 0  -> Dont take 3 , Dont take 2 , Dont take 1 = { } 
1) 0 0 1  -> Dont take 3 , Dont take 2 ,   take 1       =  {1 } 
2) 0 1 0  -> Dont take 3 ,    take 2       , Dont take 1 = { 2 } 
3) 0 1 1  -> Dont take 3 ,    take 2       ,      take 1    = { 1 , 2 } 
4) 1 0 0  ->    take 3      , Dont take 2  , Dont take 1 = { 3 } 
5) 1 0 1  ->    take 3      , Dont take 2  ,     take 1     = { 1 , 3 } 
6) 1 1 0  ->    take 3      ,    take 2       , Dont take 1 = { 2 , 3 } 
7) 1 1 1  ->    take 3     ,      take 2     ,      take 1     = { 1 , 2 , 3 } 

In the above logic ,Insert S[i] only if (j>>i)&1 ==true   { j E { 0,1,2,3,4,5,6,7 }   i = ith element in the input array }

element 1 is inserted only into those places where 1st bit of j is 1 
   if( j >> 0 &1 )  ==> for above above eg. this is true for sl.no.( j )= 1 , 3 , 5 , 7 

element 2 is inserted only into those places where 2nd bit of j is 1 
   if( j >> 1 &1 )  == for above above eg. this is true for sl.no.( j ) = 2 , 3 , 6 , 7

element 3 is inserted only into those places where 3rd bit of j is 1 
   if( j >> 2 & 1 )  == for above above eg. this is true for sl.no.( j ) = 4 , 5 , 6 , 7 

Time complexity : O(n*2^n) , for every input element loop traverses the whole solution set length i.e. 2^n*/
