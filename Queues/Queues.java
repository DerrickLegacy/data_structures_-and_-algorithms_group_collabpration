
public class Queues {
    public int queueLength = 10;
    public int items[] = new int[queueLength];
    public int front = -1;
    public int back = -1;

    boolean isEmpty() {
        if (front == -1 && back == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (back == queueLength - 1) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    void enQueue(int itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            items[back] = itemValue;
        } else {
            back++;
            items[back] = itemValue;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        int i;

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= back; i++) {
                System.out.println(items[i]);
            }
        }
    }

    void peak() {
        System.out.println("Front value is: " + items[front]);
    }

    public static void main(String[] args) {
        Queues myQueue = new Queues();

        myQueue.enQueue(3);
        myQueue.enQueue(2);
        myQueue.enQueue(1);

        myQueue.display();

        myQueue.peak();
        System.out.println("soul");
        myQueue.print();

    }
}