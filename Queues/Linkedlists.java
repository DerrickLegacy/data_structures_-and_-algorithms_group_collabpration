public class Linkedlists {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node back;

    boolean isEmpty() {
        return front == null && back == null;
    }

    void enQueue(int itemValue) {
        Node newNode = new Node(itemValue);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = null;
        } else {
            front = front.next;
        }
    }

    void display() {
        Node current = front;

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    void peak() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front value is: " + front.data);
        }
    }

    public static void main(String[] args) {
        Linkedlists myQueue = new Linkedlists();

        myQueue.enQueue(3);
        myQueue.enQueue(2);
        myQueue.enQueue(1);

        myQueue.display();

        myQueue.peak();

        myQueue.deQueue();
        myQueue.display();
    }
}
