public class InsertInCircularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNodeAfterHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node last = findLastNode();
            newNode.next = head;
            last.next = newNode;
        }
    }

    public void insertAfterKey(int key, int x) {
        if (head == null) {
            System.out.println("The list is empty. Cannot insert after key.");
            return;
        }

        Node newNode = new Node(x);
        Node ptr = head;

        do {
            if (ptr.data == key) {
                newNode.next = ptr.next;
                ptr.next = newNode;
                return;
            }
            ptr = ptr.next;
        } while (ptr != head);

        System.out.println("Key not found in the list. Cannot insert after key.");
    }

    private Node findLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }

    public static void main(String[] args) {
        InsertInCircularLinkedList circularList = new InsertInCircularLinkedList();

        // Create nodes
        Node node1 = circularList.new Node(10);
        Node node2 = circularList.new Node(11);
        Node node3 = circularList.new Node(12);
        Node node4 = circularList.new Node(13);

        // Link nodes to form a circular linked list
        circularList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1; // Make the list circular

        circularList.insertNodeAfterHead(9);
        circularList.insertNodeAtEnd(14);
        circularList.insertAfterKey(12, 14);

        Node current = circularList.head;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != circularList.head);
    }
}
