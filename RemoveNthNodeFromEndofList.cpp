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
        int cnt1=0;
        ListNode *temp=head;
        // ListNode *temp1=head;
        while(temp!=NULL){
            cnt1++;
            temp=temp->next;
        }
        if(cnt1 == n){
            return head->next;
        }
        temp=head;
        int p=cnt1-n;
        while(--p>0){
            // cnt2++;
            temp=temp->next;
        }
        temp->next=(temp->next)->next;
        // temp1=temp1->next;
        // temp1=temp1->next;
        // temp1=NULL;
        return head;
    }
};