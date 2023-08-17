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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* start = new ListNode();
        start->next = head;
        ListNode* p = start;
        ListNode* q = start;
        int k = 0;
        while(k < n){
            p = p->next;
            k++;
        }
        while(p->next != NULL){
            p = p->next;
            q = q->next;
        }
        q->next = q->next->next;
        return start->next;
    }
};