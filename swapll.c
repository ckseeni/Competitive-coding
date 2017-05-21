#include<stdio.h>
struct Node{
	int data;
	struct Node *link;
};
int search(struct Node *head, int num, struct Node **prev){
	struct Node *temp=head;
	while(temp!=NULL&&num!=temp->data){
		*prev=temp;
		temp=temp->link;
	}
	if(temp==NULL)
		return 0;
	if(num==temp->data)
		return 1;
}
int insert(struct Node **head,int num){
	struct Node *prev=NULL;
	struct Node *temp;
	temp=(struct Node *)malloc(sizeof(struct Node));
	temp->data=num;
	temp->link=NULL;
	if(*head==NULL){
		*head=temp;
		return 1;
	}
	if(!search(*head,num,&prev)){
		if(prev==NULL){
			temp->link=*head;
			*head=temp;
			return 1;
		}
		temp->link=prev->link;
		prev->link=temp;
		return 1;
	}
	
}
void swap(struct Node **head,int loc1,int loc2){
	struct Node *temp=*head;
	struct Node *location1=NULL,*location2=NULL,*prev1=NULL,*prev2=NULL,*next=NULL;
	int count=1;
	for(;temp!=NULL;temp=temp->link){
		if(count==loc1)
			location1=temp;
		if(count==loc2)
			location2=temp;
		count++;
	}
	search(*head,location1->data,&prev1);
	search(*head,location2->data,&prev2);
	next=location2->link;
	if(location1==*head){
		if(prev2==*head){
			location1->link=next;
			location2->link=location1;
			*head=location2;
		}else{
		location2->link=location1->link;
		location1->link=next;
		*head=location2;	
		prev2->link=location1;}
	}
	else{
	prev1->link=location2;
	prev2->link=location1;
	location2->link=location1->link;
	location1->link=next;
	}
}
int main(){
	struct Node *head=NULL,*temp;
	int num;
	printf("\nEnter data for linked list(-1 to end)");
	scanf("%d",&num);
	while(num!=-1){
		insert(&head,num);
		scanf("%d",&num);
	}	
	for(temp=head;temp!=NULL;temp=temp->link)
		printf("%d -> ",temp->data);
	swap(&head,1,2);
	printf("\n");
	for(temp=head;temp!=NULL;temp=temp->link)
		printf("%d -> ",temp->data);
	return 0;
}
