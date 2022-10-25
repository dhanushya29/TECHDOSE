/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    if(head==NULL || head->next==NULL)return NULL;
    struct ListNode *slow=head->next;
    struct ListNode *fast=head->next->next;
    while(slow && fast && fast->next && slow->next){
        if(slow==fast){
            break;
        }
        slow=slow->next;
        fast=fast->next->next;
    }
    if(slow!=fast)return NULL;
    slow=head;
    while(slow!=fast){
        slow=slow->next;
        fast=fast->next;
    }
    return slow;
}