/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        ListNode curr = head;
        while(curr != null) {
            if(map.containsKey(System.identityHashCode(curr)+"")){
                System.out.println(map.toString());
                return true;
            }else
                map.put(System.identityHashCode(curr)+"", true);
            curr = curr.next;
        }
        return false;
    }
}
