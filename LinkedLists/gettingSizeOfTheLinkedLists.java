public class gettingSizeOfTheLinkedLists {
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

    // Method to return the size of the linked list
    public int getSize() {
        int size = 0;
        Node current = head;

        // Traverse the linked list and count the nodes
        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public static void main(String[] args) {
        gettingSizeOfTheLinkedLists linkedList = new gettingSizeOfTheLinkedLists();

        // Set the head to null (creating an empty list)
        linkedList.head = null;

        // Add a new node to the linked list
        linkedList.head = linkedList.new Node(10);

        linkedList.head.next = linkedList.new Node(11);
        linkedList.head.next.next = linkedList.new Node(12);
        linkedList.head.next.next.next = linkedList.new Node(15);
        linkedList.head.next.next.next.next = linkedList.new Node(19);

        // Print the original linked list
        System.out.println("Original Linked List:");
        linkedList.printList();

        // Get and print the size of the linked list
        int size = linkedList.getSize();
        System.out.println("Size of the Linked List: " + size);
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
 