public class modifyingALinkedList {
    
    
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
    
        // Method to modify the value of a node at a specified position
        public void modifyNode(int position, int newValue) {
            // Check if the linked list is empty
            if (head == null) {
                System.out.println("Cannot modify. Linked list is empty.");
                return;
            }
    
            // Traverse the linked list to find the desired position
            Node current = head;
            int currentPosition = 0;
            while (current != null && currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
    
            // Check if the specified position is valid
            if (current == null) {
                System.out.println("Cannot modify. Invalid position.");
                return;
            }
    
            // Update the value of the node at the specified position
            current.data = newValue;
            System.out.println("Node at position " + position + " modified to " + newValue);
        }
    
        public static void main(String[] args) {
            modifyingALinkedList linkedList = new modifyingALinkedList();
    
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
    
            // Modify the value of the node at position 2
            linkedList.modifyNode(2, 99);
    
            // Print the modified linked list
            System.out.println("Modified Linked List:");
            linkedList.printList();
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
