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

struct Node* merge(struct Node *a,struct Node *b){
    struct Node *res=NULL;
    if(a==NULL)return b;
    if(b==NULL)return a;
    if(a->data <= b->data){
        res=a;
        res->next=merge(a->next,b);
    }
    else{
        res=b;
        res->next=merge(a,b->next);
    }
    return res;
}
void mergeSort(struct Node **head){
    struct Node *newStart;
    struct Node *temp=*head;
    if(temp==NULL || temp->next==NULL)return;
    struct Node *slow=temp,*fast=temp;
    while(fast->next!=NULL && fast->next->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    newStart=slow->next;
    slow->next=NULL;
    mergeSort(&temp);mergeSort(&newStart);
    *head=merge(temp,newStart);
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