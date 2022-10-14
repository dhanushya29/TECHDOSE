public class weekly_299{
    /**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteMiddle(struct ListNode* head){
    if(head->next==NULL)return NULL;
    struct ListNode *fastPtr=head->next->next;
    struct ListNode *slowPtr=head;
    while(fastPtr!=NULL && fastPtr->next!=NULL){
        fastPtr=fastPtr->next->next;
        slowPtr=slowPtr->next;
    }
    slowPtr->next=slowPtr->next->next;
    return head;
}
}