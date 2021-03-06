class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }
}
