import java.util.Scanner;
public class ArithematicOperations {
    public static void main(String [] args){
        System.out.println("Welcome to Arithematic Operations Practice Program..!!!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.println("The Sum is: "+(a+b));
        System.out.println("The Difference is: "+(a-b)); 
        System.out.println("The Multiplication is: "+(a*b));
        System.out.println("The Division is: "+(a/b));
        System.out.println("The Modulo is: "+(a%b));
        System.out.println("All Operations are Performed.\n Thank You.");
    }
    
}
