import java.util.Scanner;

public class factorial{
     public static int fact(int a){
        if(a == 1 || a == 0){
            return 1;
        }
        else{
            return  a * fact(a -1);
        }
     }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number whose factorial is to be calculated");
        int factorial = scan.nextInt();

        System.out.println("The factorial of " + factorial + " is " + fact(factorial));
        scan.close();
     }
}