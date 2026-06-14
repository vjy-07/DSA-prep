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
    public int pairSum(ListNode head) {
        int res = 0;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev=slow;
            slow = nextNode;
        }
        
        while(prev!=null){
            res= Math.max(res,prev.val + head.val);
            prev=prev.next;
            head=head.next;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna