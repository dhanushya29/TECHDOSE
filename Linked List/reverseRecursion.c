/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
void reverse(struct Node* nodePtr) {
    /* Last node (tail node)*/
    if(nodePtr->next == NULL || nodePtr==NULL){
        return;   
    }
    /* reverse the rest of list and put the first element at the end */
    reverse(nodePtr->next);
    nodePtr->next->next = nodePtr;  
    nodePtr->next = NULL;               
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
    printf("The elements in the linked list are ");
    display(head);
    reverse(head);
    printf("\n");
    display(head);
	return 0;
}
