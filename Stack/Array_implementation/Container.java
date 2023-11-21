
import java.util.Scanner;

public class Container {
   public int top; 
   public int capacity;
   public String[] container;

   public Container(int maxsixe){
         capacity = maxsixe;
         top = -1;
         container = new String[capacity];
   }

   public void push(String pie){
      if (isFull()){ //check if container is not full
         System.out.println("Stack is full. Cannot push " + pie + ".");
      } else {
            container[++top] = pie;
            System.out.println("Pushed " + pie + " onto the stack.");
        }
   }
   public void pop(){
      if (isEmpty()){
         System.out.println("Stack is empty, cannot pop");
      }else {
         String pie = container[top--];
         System.out.println("Popped " + pie + " from the stack.");
      }
   }
   public void peek(){
      if (top >= 0){
         String pie = container[top];
         System.out.println("Peeked at the top and found " + pie);
      }else {
         System.out.println("Stack is empty, there is nothing to peek");
      }
   }
   public boolean isEmpty(){
      return top == -1;
   }
   public boolean isFull(){
      return top == capacity -1;
   }
   public static void main(String args[]){

      try (Scanner scan = new Scanner(System.in)) {
         System.out.println("Enter the number of pies the container can contain");
         int capacity = scan.nextInt();

         Container con = new Container(capacity);

         System.out.println("How many pies do you want to keep in the container?");
         int actual_pies = scan.nextInt();

         if (actual_pies > capacity){
            System.out.println("The container can only contain "+ capacity + " pies");
            
         }else{
            int i = 1;
            while(i <= actual_pies){
               System.out.println("Enter the pie flavor to be in the container");
               String pie1 = scan.next();
               con.push(pie1);
               i++;
            }
            con.isFull();
            con.peek();
            con.pop();
            con.pop();
            con.pop();
            con.peek();
            con.isEmpty();
         }
      }

      
         
   //    for(int j = 0; j< capacity; j++){
   //       System.out.print(container[j]);
   //   }
      
   }
}
