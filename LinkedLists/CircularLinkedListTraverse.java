public class CircularLinkedListTraverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to traverse a circular linked list
    static void traverseCircularLinkedList(Node start) {
        if (start == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = start;

        do {
            // Process the current node
            System.out.print(current.data + " ");

            // Move to the next node
            current = current.next;

        } while (current != start); // Continue until we reach the starting node again
    }

    public static void main(String[] args) {
        // Creating a sample circular linked list with three nodes
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;
        third.next = first; // Making the list circular

        // Traversing the circular linked list starting from the first node
        traverseCircularLinkedList(first);
    }
}
