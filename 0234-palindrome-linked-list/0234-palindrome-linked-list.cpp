/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* Reverse(ListNode* head){
        ListNode * curr = NULL;
        ListNode* temp = NULL;
        while(head != NULL){
            temp = head->next;
            head->next = curr;
            curr = head;
            head = temp;
        }
        return curr;
    }
    bool isPalindrome(ListNode* head) {
       ListNode* s = head;
       ListNode* f = head;
       while(f->next != NULL && f->next->next != NULL){
           s = s->next;
           f = f->next->next;
       }
        s->next = Reverse(s->next);
        s = s->next;
        f = head;
        while(s != NULL){
            if(s->val != f->val) return false;
            s = s->next;
            f = f->next;
        }
       return true;
    }
};