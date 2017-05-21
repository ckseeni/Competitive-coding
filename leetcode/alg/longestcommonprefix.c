char *prefix;
char* longestCommonPrefix(char** strs, int strsSize) {
    if(strsSize==0)
        return "";
    int i;
    prefix = (char *)malloc(strlen(strs[i])*sizeof(char));
    strcpy(prefix,strs[0]);
    for(i=1;i<strsSize;i++){
        long int d = strstr(strs[i],prefix)-strs[i];
        while(d!=0){
            int l = strlen(prefix);
            prefix[l-1] = '\0';
            d = strstr(strs[i],prefix)-strs[i];
        }
    }
    return prefix;
}
Write a function to find the longest common prefix string amongst an array of strings. 
