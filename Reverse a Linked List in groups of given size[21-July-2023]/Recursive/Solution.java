//  >> JAVA RECURSIVE APPROACH

class Solution {
    public static Node reverse(Node head, int k) {
        if (head == null) return null;
        
        Node prev = null;
        Node next = null;
        Node headptr = head;
        int cnt = k;
        
        while (headptr != null && cnt != 0) {
            next = headptr.next;
            headptr.next = prev;
            prev = headptr;
            headptr = next;
            cnt--;
        }
        
        head.next = reverse(headptr, k);
        
        return prev;
    }
}