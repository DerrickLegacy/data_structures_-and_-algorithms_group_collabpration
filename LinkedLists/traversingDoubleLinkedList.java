public class traversingDoubleLinkedList {
    Node head;

    // Node class to represent individual elements in the doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        traversingDoubleLinkedList linkedList = new traversingDoubleLinkedList();

        // Set the head to null (creating an empty list)
        linkedList.head = null;

        // Add a new node to the linked list
        linkedList.head = linkedList.new Node(10);

        linkedList.head.next = linkedList.new Node(11);
        linkedList.head.next.prev = linkedList.head;

        linkedList.head.next.next = linkedList.new Node(12);
        linkedList.head.next.next.prev = linkedList.head.next;

        linkedList.head.next.next.next = linkedList.new Node(15);
        linkedList.head.next.next.next.prev = linkedList.head.next.next;

        linkedList.head.next.next.next.next = linkedList.new Node(19);
        linkedList.head.next.next.next.next.prev = linkedList.head.next.next.next;

        // Print the doubly linked list forward
        System.out.println("Doubly Linked List (Forward):");
        linkedList.printListForward();

        // // Print the doubly linked list backward
        System.out.println("Doubly Linked List (Backward):");
        linkedList.printListBackward();
    }

    // Method to print the doubly linked list in forward direction
    public void printListForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Method to print the doubly linked list in backward direction
   public void printListBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
      }

        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
}
