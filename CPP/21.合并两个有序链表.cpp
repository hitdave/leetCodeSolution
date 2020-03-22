/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    /*
    今日练习感悟：
    递归看似容易，实则不易。
    “知其然而知其所以然”很适合形容递归和非递归求解了。
    */
public:
    //递归解法
    ListNode* mergeTwoLists1(ListNode* l1, ListNode* l2) {
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        if(l1->val > l2->val){
            l2->next = mergeTwoLists1(l1, l2->next);
            return l2;
        }else{
            l1->next = mergeTwoLists1(l1->next, l2);
            return l1;
        }
    }

    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        ListNode* newHead = new ListNode(-1);
        ListNode* cur = newHead;
        while(l1!=NULL && l2!=NULL){
            if(l1->val > l2->val){
                cur->next = l2;
                l2 = l2->next;
                cur = cur->next;
            }else{
                cur->next = l1;
                l1= l1->next;
                cur = cur->next;
            }
        }
        if(l1 == NULL){
            cur->next = l2;
        }
        if(l2 == NULL){
            cur->next = l1;
        }
        return newHead->next;
    }
};