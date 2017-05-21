int lengthOfLastWord(char* s) {
    char *ptr=NULL;
    int l = 0;
    ptr = strtok(s," ");
    while(ptr!=NULL){
        l = strlen(ptr);
        ptr = strtok(NULL," ");
    }
    return l;
}
/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5. */
