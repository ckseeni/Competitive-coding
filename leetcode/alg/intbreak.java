public int integerBreak(int n) {
        /*2:1*1
          3:1*2
          4:2*2
          5:3*2
          6:3*3
          7:3*4
          8:3*3*2
          9:3*3*3
          10:3*3*4
          11:3*3*3*2 find how many 3's we can get..but if n%3==1 reaminining 1 is not eff in mul so we combine 1 and 3 to get 4*/
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        if(n==4)
            return 4;
        if(n%3==0){
            int q = n/3;
            return (int)Math.pow(3,q);
        }
        if(n%3==2){
            int q = n/3;
            return ((int)Math.pow(3,q)*2);
        }
        if(n%3==1){
            int q = (n-4)/3;
            return ((int)Math.pow(3,q)*4);
        }
        return 0;
    }
