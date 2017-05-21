public class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        ArrayList<Integer> queue = new ArrayList<Integer>();
        int r = -1;
        int f = 0;
        r++;
        queue.add(kill);
       // for(int i=0;i<*returnSize;i++)
        //    printf("%d\n",*returnSize);
        HashMap<Integer,ArrayList<Integer>> h = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<ppid.size();i++){
            if(h.containsKey(ppid.get(i))){
                ArrayList<Integer> a = h.get(ppid.get(i));
                a.add(pid.get(i));
                h.put(ppid.get(i),a);
            }   
            else{
                ArrayList<Integer> a = new ArrayList<Integer>();
                a.add(pid.get(i));
                h.put(ppid.get(i),a);
            }
        }
        while(f!=r+1){
            int p = queue.get(f);
            f++;
            if(h.containsKey(p)){
            ArrayList<Integer> a = h.get(p);
            for(int i=0;i<a.size();i++){
            
                    r++;
                    queue.add(a.get(i));
                
            }
            }
        }
        return queue;    
        }
}
/*Given n processes, each process has a unique PID (process id) and its PPID (parent process id).

Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.

We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.

Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.

Example 1:

Input: 
pid =  [1, 3, 10, 5]
ppid = [3, 0, 5, 3]
kill = 5
Output: [5,10]
Explanation: 
           3
         /   \
        1     5
             /
            10
Kill 5 will also kill 10.
*/
