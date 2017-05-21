char res1[11];
char* complexNumberMultiply(char* a, char* b) {
   char *p11,*p12,*p21,*p22;
    char res2[4],res[10];
    int a1,b1,a2,b2,r1,r2,r3;
    p11 = strtok(a,"+");
    p12 = strtok(NULL,"i");
    p21 = strtok(b,"+");
    p22 = strtok(NULL,"i");
    a1 = atoi(p11);
    b1 = atoi(p12);
    a2 = atoi(p21);
    b2 = atoi(p22);
    r1 = a1*a2;
    r3 = b1*b2;
    r3 = -r3;
    r1 = r1 + r3;
    r2 = a1*b2+b1*a2;
   // printf("%d+%di",r1,r2);
	//itoa(r1,res1,10);
	//itoa(r2,res2,10);
	sprintf(res1,"%d",r1);
	sprintf(res2,"%d",r2);
	strcat(res1,"+");
	strcat(res1,res2);
	strcat(res1,"i");
	//printf("%s",res1);
	return res1;
}
