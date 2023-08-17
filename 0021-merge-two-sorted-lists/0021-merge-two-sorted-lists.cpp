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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
           if(list1 == NULL) return list2;
           if(list2 == NULL) return list1;
           ListNode* res = NULL;
          if(list1->val < list2->val){
              res = list1;
              list1 = list1->next;
          }
        else{
            res = list2;
            list2 = list2->next;
        }
        ListNode* dummy = res;
        while(list1 != NULL && list2 != NULL){
            ListNode* temp = NULL;
            if(list1->val < list2->val){
                temp = list1;
                list1 = list1->next;
            }
            else{
                temp = list2;
                list2 = list2->next;
            }
            dummy->next = temp;
            dummy = temp;
        }
        if(list1 != NULL) dummy->next = list1;
        else {
            dummy->next = list2;
        }
        return res;
    }
};