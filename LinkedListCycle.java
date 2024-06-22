class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if head is null or only one node
        }
        
        ListNode slow = head;
        ListNode fast = head.next; // Start fast pointer one step ahead
        
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Reached end of list, no cycle
            }
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps
        }
        
        return true; // If slow and fast pointers meet, there's a cycle
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListCycle cycleDetector = new LinkedListCycle();

        // Example 1: A linked list with a cycle
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle created

        boolean hasCycle1 = cycleDetector.hasCycle(head1);
        System.out.println("List 1 has cycle: " + hasCycle1); // Output: true

        // Example 2: A linked list without a cycle
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);
        head2.next = node5;
        node5.next = node6;
        node6.next = node7;

        boolean hasCycle2 = cycleDetector.hasCycle(head2);
        System.out.println("List 2 has cycle: " + hasCycle2); // Output: false
    }
}

