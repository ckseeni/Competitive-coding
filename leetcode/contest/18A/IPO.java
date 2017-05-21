bool cmp(pair<int,int>& X,pair<int,int>& Y){
    if(X.first == Y.first){
        return X.second < Y.second;
    }
    return X.first > Y.first;
}
class Solution {
public:
    int findMaximizedCapital(int k, int W, vector<int>& Profits, vector<int>& Capital) {
        vector<pair<int,int>> X;
        for(int i=0;i<Profits.size();i++){
            X.push_back({Profits[i],Capital[i]});
        }
        sort(X.begin(),X.end(),cmp);
        for(int i=0;i<k;i++){
            for(int j=0;j<X.size();j++){
                if(X[j].second<=W){
                    W+=X[j].first;
                    X.erase(X.begin()+j);
                    break;
                }
            }
        }
        return W;
        
    }
};

/*class Interval{
    int p = 0;
    int c = 0;
}
public class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        ArrayList<Interval> arr = new ArrayList<Interval>();
        for(int i=0;i<Profits.length;i++){
            Interval in = new Interval();
            in.p = Profits[i];
            in.c = Capital[i];
            arr.add(in);
        }
        Collections.sort(arr,new Comparator<Interval>(){
            @Override
            public int compare(Interval a,Interval b){
                if(a.c==b.c){
                    return Integer.compare(a.p,b.p);
                }
                else
                    return Integer.compare(a.c,b.c);
            }
        });
       // for(int i=0;i<arr.size();i++)
         //   System.out.println(arr.get(i).p+" "+arr.get(i).c);
        int max=0,currCap = W,j=0;
        for(int i=0;i<k;i++){
            while(j+1<arr.size()&&arr.get(j).c==currCap&&arr.get(j+1).c==currCap)
                j++;
            
            if(j<arr.size()&&arr.get(j).c==currCap){
                currCap = currCap + arr.get(j).p - arr.get(j).c;
                max = max + arr.get(j).p;
            }
           // System.out.println(arr.get(j).p);
            j++;
        }
        return max;
    }
}*/ Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.

You are given several projects. For each project i, it has a pure profit Pi and a minimum capital of Ci is needed to start the corresponding project. Initially, you have W capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.

To sum up, pick a list of at most k distinct projects from given projects to maximize your final capital, and output your final maximized capital.

Example 1:

Input: k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].

Output: 4

Explanation: Since your initial capital is 0, you can only start the project indexed 0.
             After finishing it you will obtain profit 1 and your capital becomes 1.
             With capital 1, you can either start the project indexed 1 or the project indexed 2.
             Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
             Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.

Note:

    You may assume all numbers in the input are non-negative integers.
    The length of Profits array and Capital array will not exceed 50,000.
    The answer is guaranteed to fit in a 32-bit signed integer.

