class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListRecursive {
    
    // Recursive method to print the linked list
    public static void printList(Node head) {
        if (head == null) {
            return; // Base case: if the list is empty, do nothing
        }
        
        // Print the current node's data
        System.out.print(head.data + " ");
        
        // Recursively print the next nodes
        printList(head.next);
    }
    
    public static void main(String[] args) {
        // Creating the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Printing the linked list
        System.out.print("Linked List: ");
        printList(head);
    }
}
