int reverse(int x) {
    long xcpy,r=0,c=10,rem;
    if(x==0)
        return 0;
	xcpy = abs(x);
	rem = xcpy%10;
	while(rem==0){
		xcpy = xcpy/10;
		rem = xcpy%10;
	}
	while(xcpy!=0){
		rem = xcpy%10;
		r = r*c + rem;
		if(r>INT_MAX||r<INT_MIN)
			return 0;
		xcpy = xcpy/10;
	}
	if(x<0)
		r = -r;   
	return r;
}/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.
Have you thought about this?

Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

Subscribe to see which companies asked this question.
*/
