public class deleteInLinkedLists {
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
            //store the value in the head in another variable temp
            Node temp = head;
            //the node that was previously after the head becomes the head
            head = head.next;
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
            //store data in a dimi variable ptr1 and move to the next node in the list
            ptr1 = ptr;
            ptr = ptr.next;
        }

        if (ptr1 == null) {
            // meaning the list is empty
            head = null;
    
        } else {
            // Remove the last node by updating the previous node's link
            ptr1.next = null;
        }
    }
    public void deleteByKey(int key) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        Node ptr = head;o  
        Node ptr1 = null;

        while (ptr != null) {
            if (ptr.data != key) {
                ptr1 = ptr;
                ptr = ptr.next;
            } else {
                if (ptr1 == null) {
                    // Deleting the first node
                    head = ptr.next;
                } else {
                    // Removing the node by updating the previous node's link
                    ptr1.next = ptr.next;
                }
                return; // Key found and deleted
            }
        }
        System.out.println("Key not found in the list.");
    }

    public static void main(String[] args) {
        deleteInLinkedLists list = new deleteInLinkedLists();

        Node node1 = list.new Node(14);
         Node node2 = list.new Node(23);
          Node node3 =list. new Node(56);
           Node node4 =list. new Node(45);
            Node node5 = list.new Node(34);

            list.head = node1;
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node5;


        // Delete the first node
        list.deleteAtFront();

                      
        list.deleteAtEnd();

         // Change this to the key you want to delete
        list.deleteByKey(56);
        Node current =list.head;
        while(current!= null){
    System.out.println(current.data);
        current=current.next;
        }
        
    }
}
