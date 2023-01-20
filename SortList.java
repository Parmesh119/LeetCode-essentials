class ListNode {
    ListNode next;
    int val;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} 
class Solution {
public ListNode middleelement(ListNode mid){
    ListNode temp1=mid;
    ListNode temp2=mid.next;
        while(temp2!=null && temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next.next;
        }
        return temp1;
    }
    public ListNode merge(ListNode left,ListNode right){//merging two linked list
        ListNode r=new ListNode(0);
        ListNode Head=r;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                r.next=left;
                r=r.next;
                left=left.next;
            }
            else{
                r.next=right;
                r=r.next;
                right=right.next;
            }
        }
        if(left==null)r.next=right;
        if(right==null)r.next=left;
        return Head.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode midelement=middleelement(head);
        ListNode leftelement=head;
        ListNode rightelement=midelement.next;
        midelement.next=null;

        //making recursive calls
        leftelement=sortList(leftelement);
        rightelement=sortList(rightelement);
        
        ListNode resultelement=merge(leftelement,rightelement);
        return resultelement;
    }
}