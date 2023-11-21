class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class mergingLinkedLists{
    
    public Node mergeTwoLists(Node head1, Node head2) {
        Node merged = new Node(0);
        Node current = merged;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
               head1 =head1.next;
            } else {
                current.next = head2;
                head2= head2.next;
            }
            current = current.next;
        }

        // If one of the lists is not exhausted, append the remaining nodes
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        // Return the merged list starting from the first real node (not the dummy node)
        return merged.next;
    }

    // Helper method to print the linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergingLinkedLists merger = new mergingLinkedLists();

        // Example usage:
        // Assuming head1 and head2 are the heads of two sorted linked lists
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedList = merger.mergeTwoLists(head1, head2);

        // Print the merged list
        System.out.println("Merged List:");
        merger.printList(mergedList);
    }
}
