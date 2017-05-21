You are living in a town consisting of N cities. Furthurmore, in this town there are K city-groups. You can reach any city from any city in a same city-group instantaneously. you can go from any city in ith city-group to any city in i+1th city-group in 1 second and from any city in i+1th city-group to any city in ith city-group in 1 second for each i between 1 and K-1, you can also go from any city in first city-group to any city in Kth city-group in 1 second and from any city in Kth city-group to any city in first city-group in 1 second.

You have been given Q queries each containing two cities X and Y. For each query, you have to print the minimum time it takes to reach city Y from city X.

INPUT:
First line of input will consists of two integers N and K denoting total number of cities and city groups. Next K lines will consists of information regarding city-groups. First integer in these K lines will consists of number of cities Si belonging to that city-group. Next Si integers for each line will consists of cities belonging to ith city-group. Next line will consists of integer Q denoting total number of queries. Next Q lines will consists of two cities X and Y.

OUTPUT:
For each of the query, print minimum time needed to reach city Y from city X.

CONSTRAINTS:
1 ≤ N,K,Q ≤ 105
0 ≤ Si ≤ N
Its guaranteed that each city will belong to exactly one city group.
SAMPLE INPUT

10 6
0
1 1
2 2 4
0
2 3 5
5 6 8 7 9 10
4
7 10
1 2
1 5
6 2

#include <stdio.h>

int main()
{
    int n,k;
    scanf("%d",&n);
    scanf("%d",&k);
    int arr[n];
    for(int i=0;i<k;i++){
        int t;
        scanf("%d",&t);
        for(int j=0;j<t;j++){
            int e;
            scanf("%d",&e);
            arr[e] = i;
        }
    }
    int q;
    scanf("%d",&q);
    while(q>0){
        int x,y;
        scanf("%d",&x);
        scanf("%d",&y);
        if(arr[x]==arr[y])
            printf("0\n");
        else if((arr[x]==0&&arr[y]==k-1)||(arr[x]==k-1&&arr[y]==0))
            printf("1\n");
        else{
            int d1 = abs(arr[x]-arr[y]);
            int m1,m2;
            if(arr[x]>arr[y]){
                m2 = arr[x];
                m1 = arr[y];
            }
            else{
                m1 = arr[x];
                m2 = arr[y];    
            }
            int d2 = m1 + (k-1-m2) + 1;
            int d;
            if(d1<d2)
                d = d1;
            else
                d = d2;
            //if(d==d2)
                printf("%d\n",d);
            //else
              //  printf("%d\n",d);
        }
        q--;
    }
    return 0;
}

