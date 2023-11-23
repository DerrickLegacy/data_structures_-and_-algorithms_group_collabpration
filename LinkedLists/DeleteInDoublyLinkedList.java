public class DeleteInDoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int x) {
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }

    public void deleteAtFront() {
        if (head != null) {
            Node temp = head;
            head = head.next;

            // Update the previous pointer of the new head to null
            if (head != null) {
                head.prev = null;
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
        Node ptr1 = null;

        while (ptr.next != null) {
            ptr1 = ptr;
            ptr = ptr.next;
        }

        if (ptr1 == null) {
            // Only one node in the list
            head = null;
        } else {
            // Remove the last node by updating the previous node's links
            ptr1.next = null;
            ptr.prev = null;
        }
    }

    public void deleteByKey(int key) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        Node ptr = head;

        while (ptr != null) {
            if (ptr.data != key) {
                ptr = ptr.next;
            } else {
                if (ptr.prev == null) {
                    // Deleting the first node
                    head = ptr.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    // Removing the node by updating the previous and next node's links
                    ptr.prev.next = ptr.next;
                    if (ptr.next != null) {
                        ptr.next.prev = ptr.prev;
                    }
                }
                return; // Key found and deleted
            }
        }
        System.out.println("Key not found in the list.");
    }

    public static void main(String[] args) {
        DeleteInDoublyLinkedList list = new DeleteInDoublyLinkedList();

        Node node1 = list.new Node(14);
        Node node2 = list.new Node(23);
        Node node3 = list.new Node(56);
        Node node4 = list.new Node(45);
        Node node5 = list.new Node(34);

        list.head = node1;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        // Delete the first node
        list.deleteAtFront();

        // Delete the last node
        list.deleteAtEnd();

        // Change this to the key you want to delete
        list.deleteByKey(56);

        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

