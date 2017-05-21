

correct me if I'm wrong.
I think the idea is to store the diff and number of times this diff has appeared before in a hash map for each element;
And we only calculate the diff between current element and the element before current.
for example:
[2] stores a empty hashmap
[2,4] now 4 stores a mapentry [2,1] because 4-2 = 2,and for element 2 stores nothing
[2,4,6] 6-4 =2 and since element 4 stores[2,1], which means diff 2 has appeared once before, so count = 1 and we put [2,2] in 6. Also 6-2 = 4, we put [4,1] in 6;

the timing of record count and pass it to the result is perfect, i wish i could work it out by myself one day

hope it helps!
 public int numberOfArithmeticSlices(int[] A) {
        int re = 0;
        HashMap<Integer, Integer>[] maps = new HashMap[A.length];
        for(int i=0; i<A.length; i++) {
            maps[i] = new HashMap<>();
            int num = A[i];
            for(int j=0; j<i; j++) {
                if((long)num-A[j]>Integer.MAX_VALUE) continue;
                if((long)num-A[j]<Integer.MIN_VALUE) continue;
                int diff = num - A[j];
                int count = maps[j].getOrDefault(diff, 0);
                maps[i].put(diff, maps[i].getOrDefault(diff,0)+count+1);
                re += count;
            }
        }
        return re;
    }

