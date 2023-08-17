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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* s = headA;
        ListNode* f = headB;
        while(s != f){
            if(s == NULL) s = headB;
            else s = s->next;
            if(f == NULL) f = headA;
            else f = f->next;
        }
        return s;
    }
};