#include<stdio.h>
#define size 100
struct stack{
	int arr[size];
	int top;
};
void push(struct stack *s, int a){
	s->top=s->top+1;
	s->arr[s->top]=a;
}
void rec(struct stack *s){
	int p;
	if(s->top!=-1){
		p=s->arr[s->top];
		s->top=s->top-1;
		rec(s);
		printf("\n%d",p);
		push(s,p);	
	}
	return;
}
void pop(struct stack *s){
	int p;
	p=s->arr[s->top];
	s->top=s->top-1;
	printf("%d",p);
}

int main(){
	struct stack s;
	int a[]={1,2,3,4,5,6},i;
	s.top=-1;
	for(i=0;i<6;i++)
		push(&s,a[i]);
	

	rec(&s);
	while(s.top!=-1){
		pop(&s);
	}
	return 0;
}
