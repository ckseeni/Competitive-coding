int romanToInt(char* s) {
    int sum = 0,i;
	for(i=0;i<strlen(s);i++){
		if(s[i]=='I')
			sum = sum + 1;
		if(s[i]=='V')
			sum = sum + 5;	
		if(s[i]=='X')
			sum = sum + 10;
		if(s[i]=='L')
			sum = sum + 50;
		if(s[i]=='C')
			sum = sum + 100;
		if(s[i]=='D')
			sum = sum + 500;
		if(s[i]=='M')
			sum = sum + 1000;					
	}
	if(strstr(s,"IV")!=NULL)
		sum = sum-2;
	if(strstr(s,"IX")!=NULL)
		sum = sum-2;
	if(strstr(s,"XL")!=NULL)
		sum = sum-20;
	if(strstr(s,"XC")!=NULL)
		sum = sum-20;
	if(strstr(s,"CD")!=NULL)
		sum = sum-200;
	if(strstr(s,"CM")!=NULL)
		sum = sum-200;   
	return sum;
}/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Subscribe to see which companies asked this question.
*/
