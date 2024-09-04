class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0)
            return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values1 = { 1, 2, 3, 4, 5 };
        ListNode head1 = createLinkedList(values1);
        System.out.println("Head of Linked List 1: ");
        printLinkedList(head1);

        ListNode middleLL1 = middleNode(head1);
        System.out.println("Middle of Linked List 1: " + middleLL1.val);

        int[] values2 = { 1, 2, 3, 4, 5, 6 };
        ListNode head2 = createLinkedList(values2);
        System.out.println("Head of Linked List 2: ");
        printLinkedList(head2);

        ListNode middleLL2 = middleNode(head2);
        System.out.println("Middle of Linked List 2: " + middleLL2.val);
    }
}
