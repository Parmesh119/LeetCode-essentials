
class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode d=new ListNode();
        ListNode node=d;
        // ListNode temp2=head;
        d.next=head;
        while(node!=null){
            ListNode first=node.next;
            ListNode second=null;
            if(first!=null){
                second=first.next;
            }if(second!=null){
                ListNode snext=second.next;
                second.next=first;
                node.next=second;
                first.next=snext;
                node=first;
            }else{
                break;
            }
        }
        return d.next;
    }
}
