#include<stdio.h>
#include<stdlib.h>
int main(){
	int n,k,a[100],b[100],i=0,maxb=0,maxpos=0,prosum=0;
	char temp;
	scanf("%d %d",&n,&k);

	for(i=0;i<n;i++){
		a[i]=0;
		b[i]=0;
	}
	i=0;

	do{
		scanf("%d%c",&a[i],&temp);
		i++;
	}while(temp!='\n'&&i<n);
	i=0;

	do{
		scanf("%d%c",&b[i],&temp);
		i++;
	}while(temp!='\n'&&i<n);

	for(i=0;i<n;i++){
		if(maxb<abs(b[i])){
			maxb=b[i];
			maxpos=i;
		}
	}
	
	
	if(maxb<0)
		a[maxpos]=a[maxpos]+(k*2);
	else
		a[maxpos]=a[maxpos]-(k*2);
	for(i=0;i<n;i++)
		printf("\n%d",a[i]);
	for(i=0;i<n;i++)
		prosum=prosum+(a[i]*b[i]);
	printf("minimum product sum is %d",prosum);
	return 0;
}
