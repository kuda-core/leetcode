/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<String,Boolean> map = new HashMap<>();
        while(headA != null && headB != null) {
            if(!map.containsKey(headA+"")) {
                map.put(headA+"",true);
                headA = headA.next;
            } else {
                return headA;
            }
            if(!map.containsKey(headB+"")) {
                map.put(headB+"",true);
                headB = headB.next;
            } else {
                return headB;
            }
        }
        while(headA != null) {
            if(!map.containsKey(headA+"")) {
                map.put(headA+"",true);
                headA = headA.next;
            } else {
                return headA;
            }
        }
        while(headB != null) {
            if(!map.containsKey(headB+"")) {
                map.put(headB+"",true);
                headB = headB.next;
            } else {
                return headB;
            }
        }
        
        return null;
    }
}
