class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedListHandler {

    // Method to delete even nodes
    public static Node deleteEvenNodes(Node head) {
        // Remove even nodes at the start
        while (head != null && head.data % 2 == 0) {
            head = head.next;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data % 2 == 0) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // Helper method to print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a list from array
    public static Node createList(int[] values) {
        if (values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] values = {2, 4, 5, 6, 7, 8, 9};
        Node head = createList(values);

        System.out.println("Original List:");
        printList(head);

        head = deleteEvenNodes(head);

        System.out.println("List After Deleting Even Nodes:");
        printList(head);
    }
}
