bool checkPerfectNumber(int num) {
    int i,sum=1,f,s;
    if(num==1)
        return false;
    for(i=2;i<=sqrt(num);i++){
        f = i;
        s = num/i;
        if(f!=s){
            if(num%f==0)
                sum = sum + f;
            if(num%s==0)
                sum = sum + s;
        }
        else{
            if(num%i==0)
                sum = sum + i;
        }
    }
    if(sum==num)
        return true;
    else
        return false;
}
/*We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

Example:

Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14

Note: The input number n will not exceed 100,000,000. (1e8) */
