#include <stdio.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t>0){
        int n;
        scanf("%d",&n);
        int c[n],l[n];
        for(int i=0;i<n;i++)
            scanf("%d",&c[i]);
        for(int i=0;i<n;i++)
            scanf("%d",&l[i]);
        int i=0;
        long cost = 0;
        for(i=0;i<n;){
            long d =(long) l[i];
            int j=0;
            for(j=i+1;j<n;j++){
                if(c[i]>c[j])
                    break;
                d = d + (long)l[j];
            }
            cost = cost +(long) c[i]*d;
            i = j;
        }  
        printf("%ld\n",cost);
        t--;
    }
    return 0;
}
/*Monk loves to travel. Since his summer vacation was nearing, he decided to plan a journey to Coderland. Now as Monk is just a competitive programmer, he is always short of money. In order to make this journey happen, he wants to minimize the total travel expenditure.

Journey to Coderland will be through N
checkpoints. Checkpoints are numbered from 0 to N−1. At the start of the journey Monk is present at the checkpoint 0. Also checkpoint N−1 will lead to Coderland. Each checkpoint has a petrol pump which can be used to fill petrol in the car. Now cost of petrol per litre at different checkpoints is given by array C which has 0-based indexing where C[i] is the cost per litre of petrol at the ith checkpoint. Note that there is an infinite amount of supply at each checkpoint and car tank is also of infinite capacity. Now another array L is given which has 0-based indexing where L[i] denotes the amount of petrol in litres required to reach the (i+1)th checkpoint from the ith checkpoint. Note that the extra petrol remaining in the tank does not vanishes after reaching a checkpoint. Also, Monk should have atleast L[i]

litres of petrol at each checkpoint in order to reach the next checkpoint.

Can you help Monk estimate the minimum cost required in order complete the journey?

Input:

First line of the input contains test cases denoted by T

.

For each of the test cases, first line contains a single integers N

denoting the number of checkpoints.

The next line contains N
space separated integers representing the array C which has 0-based indexing where the ith integer denotes the cost per litre of petrol at ith

checkpoint.

Last line contains array L
,which has 0-based indexing, consisting of N space separated integers where the ith integer denotes the required amount of petrol needed to reach the (i+1)th checkpoint from the ith

checkpoint.

-Output:

For each of the test cases, output the required answer in a separate line.

Constraints:

    1≤T≤5

1≤N≤105

1≤C[i],L[i]≤105

SAMPLE INPUT

1
2
5 1 
1 2

SAMPLE OUTPUT

7

*/
