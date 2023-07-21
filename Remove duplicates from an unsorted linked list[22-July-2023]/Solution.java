//   >> JAVA CODE <<

class Solution
{
   
     public  Node removeDuplicates(Node head) {
        Node ansList = new Node(-1);
        Node ansptr = ansList;
        HashSet<Integer> st = new HashSet<>();

        while (head != null) {
            if (!st.contains(head.data)) {
                st.add(head.data);
                ansptr.next = head;
                ansptr = ansptr.next;
            }

            head = head.next;
        }

        ansptr.next = null;

        return ansList.next;
    }
}