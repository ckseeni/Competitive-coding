 public int integerReplacement(int n) {
        if(n==Integer.MAX_VALUE)
            return 32;//n=2^32-1
        int c = 0;
        while(n>1){
            if(n%2==0)
                n=n/2;
            else{
                if((n+1)%4==0&&(n-1!=2))
                    n=n+1;//eg:1011-->1100(we can remove more zeros when divide by 4 but ifn==3 its false so only the check condition is like this)
                else
                    n=n-1;
            }    
            c++;    
        }
        return c;
    }
