#include<stdio.h>
#include<strings.h>
#define size 100

struct stack{
	int arr[size];
	int top;
};

void push(struct stack *s,int x){
	if(s->top==size-1)
		printf("\nStack is full");
	else{
		s->top=s->top+1;
		s->arr[s->top]=x;
	}
}

int pop(struct stack *s,int *p){
	if(s->top==-1){
		return 0;
		
	}
	else{
		*p=s->arr[s->top];
		s->top=s->top-1;
		return 1;
	}
}

int main(){
	struct stack s;
	char string[size];
	int p,i,next;
	int array[size]={3,1,4,13,6,9};
	s.top=-1;
	push(&s,array[0]);
	for(i=1;i<6;i++){
		next=array[i];
		
		pop(&s,&p);
		while((pop(&s,&p))&&p<next){
			printf("%d->%d",p,next);
			pop(&s,&p);			
		}
		if(p>next)
			push(&s,p);
		push(&s,next);
	}
	pop(&s,&p);
	while(p!=-1){
		printf("%d->-1",p);
		pop(&s,&p);
	}
		
	return 0;
}
