public class DeleteInCircularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public void deleteAtFront() {
        if (head != null) {
            Node temp = head;

            // If the list has only one node, set head to null
            if (head.next == head) {
                head = null;
            } else {
                // Move to the next node and update the last node's link
                Node last = findLastNode();
                head = head.next;
                last.next = head;
            }

            // Release the deleted node
            temp = null;
        } else {
            System.out.println("The list is empty. Cannot delete.");
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        Node ptr = head;
        Node prev = null;

        // Traverse to the last node
        while (ptr.next != head) {
            prev = ptr;
            ptr = ptr.next;
        }

        if (prev == null) {
            // Only one node in the list
            head = null;
        } else {
            // Remove the last node by updating the previous node's link
            prev.next = head;
        }
    }

    public void deleteByKey(int key) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        Node current = head;
        Node prev = null;

        do {
            if (current.data != key) {
                prev = current;
                current = current.next;
            } else {
                if (prev == null) {
                    // Deleting the first node
                    head = current.next;
                    findLastNode().next = head;
                } else {
                    // Removing the node by updating the previous node's link
                    prev.next = current.next;
                }
                return; // Key found and deleted
            }
        } while (current != head);

        System.out.println("Key not found in the list.");
    }

    private Node findLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }

    public static void main(String[] args) {
        DeleteInCircularLinkedList list = new DeleteInCircularLinkedList();

        Node node1 = list.new Node(14);
        Node node2 = list.new Node(23);
        Node node3 = list.new Node(56);
        Node node4 = list.new Node(45);
        Node node5 = list.new Node(34);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1; // Make the list circular

        // Delete the first node
        list.deleteAtFront();

        // Delete the last node
        list.deleteAtEnd();

        // Change this to the key you want to delete
        list.deleteByKey(56);

        Node current = list.head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != list.head);
    }
}
