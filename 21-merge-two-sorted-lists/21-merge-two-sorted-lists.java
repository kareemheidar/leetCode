/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode r = result;
        ListNode L1 = list1;
        ListNode L2 = list2;
        while (L1 != null || L2 != null){
            if(L1 == null){
                r.next = L2;
                break;
            } else if (L2 == null) {
                r.next = L1;
                break;
            }
            if (L1.val <= L2.val){
                r.next = L1;
                L1 = L1.next;
            }
            else {
                r.next = L2;
                L2 = L2.next;
            }
            r = r.next;
        }
        return result.next;
    }
}