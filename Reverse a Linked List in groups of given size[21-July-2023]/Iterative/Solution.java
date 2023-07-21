//  >> JAVA ITERATIVE APPROACH

class Solution
{
    private static Node reverseList(Node head) {
        Node prev = null;
        Node next = null;
        Node ptr = head;
        
        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }
        
        return prev;
    }
    
    public static Node reverse(Node head, int k) {
        Node nn = head;
        Node ans = new Node(-1);
        Node ansPtr = ans;
        
        while (nn != null) {
            Node start = nn;
            Node end = nn;
            
            int cnt = k;
            while (end != null && cnt != 1) {
                end = end.next;
                cnt--;
            }
            
            if (end != null) {
                nn = end.next;
                end.next = null;
            } else {
                nn = null;
            }
            
            ansPtr.next = reverseList(start);
            ansPtr = start;
        }
        
        return ans.next;
    }
}