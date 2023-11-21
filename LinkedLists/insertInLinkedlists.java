public class insertInLinkedlists {
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

    public void insertNodeAfterHead(int data) {

        Node newNode = new Node(data);
        // make the pointer of the newNode to point in the direction where the hader pointer has been pointing
        newNode.next = head.next;
         // header points to the new node
        head.next = newNode;
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAfterKey(int key, int x) {
        Node newNode = new Node(x);
        Node pointkey = head;
        while (pointkey  != null &&pointkey .data != key) {
           pointkey  = pointkey .next;

        if (pointkey != null) {
            newNode.next = pointkey .next;

            // Step 4: Allocate the new data value x (already done when creating the new node)

            // Step 5: Update the key's link to point at the new node
           pointkey .next = newNode;
        }
    }
    }

    public static void main(String[] args) {
        insertInLinkedlists linkedList = new insertInLinkedlists();

        // Create nodes
        Node node1 = linkedList.new Node(10);
        Node node2 = linkedList.new Node(11);
        Node node3 = linkedList.new Node(12);
        Node node4 = linkedList.new Node(13);

        // Link nodes to form a linked list
        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
      
        linkedList.insertNodeAfterHead(9);
        
        linkedList.insertNodeAtEnd(14);
        
         linkedList.insertAfterKey(9, 12);
        Node current = linkedList.head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
