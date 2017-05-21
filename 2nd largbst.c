#include<stdio.h>
struct bstree{
	struct bstree *lchild;
	int data;
	struct bstree *rchild;
};
int search(struct bstree *root,int data,struct bstree **prev){
	struct bstree *temp;
	temp=root;
	while(temp!=NULL&&temp->data!=data){
		*prev=temp;
		if(data<temp->data)
			temp=temp->lchild;
		else 
			temp=temp->rchild;
	}
	if(temp==NULL)
		return 0;
	else
		return 1;
}
void insert(struct bstree **root,int data){
	struct bstree *new,*prev;
	new = (struct bstree *)malloc(sizeof(struct bstree));
	new->data=data;
	new->lchild=NULL;
	new->rchild=NULL;
	if(*root==NULL)
		*root=new;
	else{
		if(search(*root,data,&prev))
			printf("\nduplicate found!!");
		else{
			if(data<prev->data)
				prev->lchild=new;
			else
				prev->rchild=new;
		}		
	}
}
void inorder(struct bstree *root){
	if(root!=NULL){
		inorder(root->lchild);
		printf("\n%d",root->data);
		inorder(root->rchild);
	}
}
void second(struct bstree **root){
	struct bstree *temp=*root,*prev;
	while(temp->rchild!=NULL){
		prev=temp;
		temp=temp->rchild;
	}	
	printf("\nsecond largest data is %d",prev->data);
}
int main(){
	struct bstree *root=NULL;
	char a;
	int data;
	printf("\nEnter data for tree:");
	while(a!='\n'){
		scanf("%d%c",&data,&a);
		insert(&root,data);
	}	
	inorder(root);
	
	second(&root);
	return 0;
}
