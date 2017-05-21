#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int t;
    scanf("%d",&t);
    while(t>0){
        int n;
        scanf("%d",&n);
        int arr[n],f=0,flag=0;
        for(int i=0;i<n;i++){
            scanf("%d",&arr[i]);
            if(arr[i]>=0)
                flag=1;
        }
        if(flag==0){
             int min = -1000;
             for(int i=0;i<n;i++){   
                 if(min<arr[i])
                     min = arr[i];
             }    
            printf("%d\n",min);
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]>=0){
                    printf("%d ",arr[i]);
                    f=1;
                }
            }
            if(f==1)
                printf("\n");
        }
        t--;
    }
    return 0;
}

