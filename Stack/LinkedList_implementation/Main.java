//This program implements stacks using linked lists

//First create a template where our nodes will be created from
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack{
    public Node top;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Added " + newNode.data + " to the stack");
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Cant pop anything because stack is empty");
        }else{
          int poppedValue = top.data;
          top = top.next;
          System.out.println("Popped "+ poppedValue + " from the stack");  
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Cant peek if the stack is empty");
        }else{
            int topValue = top.data;
            System.out.println("Peeked and found " + topValue + " at the top");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack is empty:"+ stack.isEmpty());
        stack.pop();
        stack.pop();

        stack.peek();
    }
    

    
}















































