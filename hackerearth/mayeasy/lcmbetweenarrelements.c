#include <stdio.h>
long gcd(long a,long b){
    if(b==0)
        return a;
    return gcd(b,a%b);
}
int main()
{
    int t;
    scanf("%d",&t);
    while(t>0){
        int n;
        scanf("%d",&n);
        int arr[n];
        for(int i=0;i<n;i++)
            scanf("%d",&arr[i]);
        long ans = arr[0];
        for(int i=1;i<n;i++){
           long g = gcd(ans,arr[i]);
           ans = ((long)(ans * arr[i])/g);
        }
        printf("%ld\n",ans);
        t--;
    }
    return 0;
}
