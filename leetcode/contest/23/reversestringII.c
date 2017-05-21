 Reverse String II

    User Accepted: 1116
    User Tried: 1218
    Total Accepted: 1156
    Total Submissions: 2668
    Difficulty: Easy

Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Restrictions:

    The string consists of lower English letters only.
    Length of the given string and k will in the range [1, 10000]


char* reverseStr(char* s, int k) {
    if(k>=strlen(s)){
        for(int j=0;j<strlen(s)/2;j++){
            char t = s[j];
            s[j] = s[strlen(s)-j-1];
            s[strlen(s)-j-1] = t;
        }     
    }
    else{
		int i,c;
      	for(i=0,c=0;i<strlen(s)-k;i=i+k,c++){
            if(c%2==0){
                for(int j=i;j<(i+k/2);j++){
                    char t = s[j];
                    s[j] = s[i+k-(j-i)-1];
                    s[i+k-(j-i)-1] = t;
                }   
            }
        }
		//printf("%d",strlen(s)-i);
		if(strlen(s)-i<=k&&c%2==0){
			 for(int j=i,l=0;l<(strlen(s)-i)/2;j++,l++){
		        char t = s[i+l];
		        s[i+l] = s[strlen(s)-l-1];
		        s[strlen(s)-l-1] = t;
				
        	} 	
		}
    }
    return s;
}
