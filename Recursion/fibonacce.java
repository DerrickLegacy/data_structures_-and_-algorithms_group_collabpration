import java.util.Scanner;

public class fibonacce {
     public static int fib(int a){
        if (a == 1 || a == 2){
            return 1;
        }
        else{
            return fib(a - 2) + fib(a - 1);
        }
     }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to get its fibonacce");

        int fibonacce = scan.nextInt();
        System.out.println("The fibonacce of " + fibonacce + " is " + fib(fibonacce));
        scan.close();
     }
}
