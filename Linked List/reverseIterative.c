#include<stdio.h>
#include<stdlib.h>
/*create a structure named as Node */
struct Node {
    int data;
    struct Node*next;
};
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
void reverse(struct Node **head){
    struct Node *prev = NULL;
    struct Node *current = *head;
    struct Node *next = NULL;
    /*Enter your logic here*/
    while(current!=NULL){
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    *head=prev;
}
int main() {
/* insert your code here */
    int n;
    printf("Enter the number of nodes:\n");
    scanf("%d",&n);
    int data;
    struct Node*head=NULL;
    for(int i=0;i<n;i++){
        scanf("%d",&data);
        append(&head,data);
    }
    printf("The elements in the linked list are ");
    display(head);
    reverse(&head);
    printf("\n");
    display(head);
	return 0;
}
