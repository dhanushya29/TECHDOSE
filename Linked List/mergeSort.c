#include<stdio.h>
#include<stdlib.h>
/*create a structure named as Node */
struct Node {
    int data;
    struct Node*next;
};
struct Node*head=NULL;
struct Node *createNode(int data){
    struct Node *nn=(struct Node*)malloc(sizeof(struct Node));
    nn->data=data;
    nn->next=NULL;
    return nn;
} 
void append ( struct Node **head, int data ){
	//Fill in the code here
	struct Node *nn=createNode(data);
	if(*head==NULL){
	    *head=nn;
	}else{
	    struct Node *temp=*head;
	    while(temp->next!=NULL){
	        temp=temp->next;
	    }
	    temp->next=nn;
	}
}
void display ( struct Node *head ){
	//Fill in the code here
	while(head!=NULL){
	    printf("%d->",head->data);
	    head=head->next;
	}
	printf("NULL");
}

struct Node * merge(struct Node*a,struct Node*b){
    struct Node *result=NULL;
    if(a==NULL)return b;
    if(b==NULL)return a;
    // while(a!=NULL && b!=NULL){
        if(a->data <= b->data){
            result=a;
            result->next=merge(a->next,b);
        }else{
            result=b;
            result->next=merge(a,b->next);
        }
    return result;
}
void midNode(struct Node *head,struct Node **a,struct Node **b){
    if(head==NULL || head->next==NULL){
        *a=head;
        *b=NULL;
        return;
    }
    struct Node *slow=head;
    struct Node *fast=head->next;
    fast=fast->next;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    *a = head;
    *b = slow->next;
    slow->next=NULL;
}
void mergeSort(struct Node ** head){
    if(*head==NULL || *(head)->next ==NULL)return;
    struct Node *a;
    struct Node *b;
    midNode(*head,&a,&b);
    mergeSort(&a);mergeSort(&b);
    *head=merge(a,b);
}
int main() {
/* insert your code here */
    int n;
    printf("Enter the number of nodes:\n");
    scanf("%d",&n);
    int data;
    
    for(int i=0;i<n;i++){
        scanf("%d",&data);
        append(&head,data);
    }
    // printf("The elements in the linked list are ");
    display(head);
    mergeSort(&head);
    // reverse(head);
    printf("\n");
    // printf("%d",detectLoop(head));
    display(head);
	return 0;
}


