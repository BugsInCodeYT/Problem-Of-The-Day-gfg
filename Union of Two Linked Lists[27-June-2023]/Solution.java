//    >> JAVA CODE <<

class Solution {
    public Node union(Node head1, Node head2) {
        Node merged = merge(head1, head2);
        Node sorted = sort(merged);
        return sorted;
    }

    private Node merge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node ans = null;

        if (a.data < b.data) {
            ans = a;
            ans.next = merge(a.next, b);
        } else if (b.data < a.data) {
            ans = b;
            ans.next = merge(a, b.next);
        } else {
            ans = a;
            ans.next = merge(a.next, b.next);
        }

        return ans;
    }

    private Node sort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node mid = slow;
        Node nextToMid = mid.next;
        mid.next = null;

        Node first = sort(head);
        Node second = sort(nextToMid);

        Node ans = merge(first, second);

        return ans;
    }
}
