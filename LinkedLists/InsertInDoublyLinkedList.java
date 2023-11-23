public class InsertInDoublyLinkedList {
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

    public void insertNodeAfterHead(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insertAfterKey(int key, int x) {
        Node newNode = new Node(x);

        Node ptr = head;
        while (ptr != null && ptr.data != key) {
            ptr = ptr.next;
        }

        if (ptr != null) {
            newNode.next = ptr.next;
            newNode.prev = ptr;

            if (ptr.next != null) {
                ptr.next.prev = newNode;
            }

            ptr.next = newNode;
        }
    }

    public static void main(String[] args) {
        InsertInDoublyLinkedList linkedList = new InsertInDoublyLinkedList();

        // Create nodes
        Node node1 = linkedList.new Node(10);
        Node node2 = linkedList.new Node(11);
        Node node3 = linkedList.new Node(12);
        Node node4 = linkedList.new Node(13);

        // Link nodes to form a doubly linked list
        linkedList.head = node1;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;

        linkedList.insertNodeAfterHead(9);
        linkedList.insertNodeAtEnd(14);
        linkedList.insertAfterKey(12, 15);

        Node current = linkedList.head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
