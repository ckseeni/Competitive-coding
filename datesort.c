#include<stdio.h>
struct datestr{
	int date,month,year;
};
struct datestr arr[100];
void swap(int i,int j){
	struct datestr temp;
	temp.year=arr[i].year;
	temp.month = arr[i].month;
	temp.date = arr[i].date;
	arr[i].year=arr[j].year;
	arr[i].month=arr[j].month;
	arr[i].date=arr[j].date;
	arr[j].year=temp.year;
	arr[j].month=temp.month;
	arr[j].date=temp.date;
}
void sort(int n){
	int i,j;
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(arr[i].year>arr[j].year)
				swap(i,j);
			else if(arr[i].year==arr[j].year&&arr[i].month>arr[j].month)
				swap(i,j);
			else if(arr[i].year==arr[j].year&&arr[i].month==arr[j].month&&arr[i].date>arr[j].date)
				swap(i,j);
		}
	}
}

int main(){
	int i,n;
	printf("\nEnter no of dates:");
	scanf("%d",&n);
	printf("\nEnter date one by one:format'DD MM YYYY'");
	for(i=0;i<n;i++)
		scanf("%d %d %d",&arr[i].date,&arr[i].month,&arr[i].year);
	sort(n);
	for(i=0;i<n;i++)
		printf("\n%d %d %d",arr[i].date,arr[i].month,arr[i].year);
	return 0;
}
