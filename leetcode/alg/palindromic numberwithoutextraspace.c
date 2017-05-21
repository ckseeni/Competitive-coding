int count(int x){
	int c=0;
	if(x==0)
	    return 1;
	while(x!=0){
		c++;
		x =x/10;
	}
	return c;
}
bool isPalindrome(int x) {
    int len,mul=1,i,f,s;
    if(x<0)
        return false;
    x = abs(x);
	len = count(x);
	if(len==1)
		return true;
	for(i=1;i<=len-1;i++)
		mul = mul*10;
	while(x!=0){
		f = x/mul;
		s = x%10;
		if(f!=s)
			return false;
		x = x/10;
		mul = mul/10;
		if(mul==0)
			break;
		x = x%mul;
		mul = mul/10;
	}   
	return true;
}
/*Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.
Some hints:

Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

Subscribe to see which companies asked this question.
*/
