#include "matrix.h"

bool detectLoop(struct Node *head){
    struct Node *fastPtr=head;
    struct Node *slowPtr=head;
    while(fastPtr->next && fastPtr && slowPtr && slowPtr->next){
        slowPtr=slowPtr->next;
        fastPtr=fastPtr->next->next;
        if(slowPtr==fastPtr){
            return true;
        }
    }
    return false;
}