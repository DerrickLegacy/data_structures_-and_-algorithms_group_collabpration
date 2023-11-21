public class traversingALinkedList {
    Node head;

    // Node class to represent individual elements in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        traversingALinkedList linkedList = new traversingALinkedList();

        // Set the head to null (creating an empty list)
        linkedList.head = null;

        // Add a new node to the linked list
        linkedList.head = linkedList.new Node(10);

        linkedList.head.next = linkedList.new Node(11);
        linkedList.head.next.next = linkedList.new Node(12);
        linkedList.head.next.next.next = linkedList.new Node(15);
        linkedList.head.next.next.next.next = linkedList.new Node(19);
        Node current = linkedList.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
