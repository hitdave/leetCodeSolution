/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        ListNode* current = head->next;
        ListNode* pre = head;
        while(current != NULL && current->next != NULL){
            if(pre->val == current->val){
                current = current->next;
            }else{
                pre->next = current;
                pre = pre->next;
                current = current->next;
            }
        }
        if(current->val == pre->val){
            pre->next = NULL;
        }else{
            pre->next = current;
        }
        return head;
    }
};