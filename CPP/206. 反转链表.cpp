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
    //头插法
    ListNode* reverseList(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        ListNode* newHead = new ListNode(-1);
        while(head != NULL){
            ListNode* temp = head->next;
            head->next = newHead->next;
            newHead->next = head;
            head = temp;
        }
        return newHead->next;
    }
};