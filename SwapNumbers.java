import java.util.*;
public class SwapNumbers {
    public static void main(String[] args) {
    System.out.println("Welcome to Number Swappng Program..!"); 
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number a: "); 
    int a=sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b=sc.nextInt();
    int c=a;
    a=b;
    b=c;
    System.out.println("New Number a is: "+a);
    System.out.println("New Number b is: "+b);
    System.out.println("Swapping Numbers is Successfull");
    }
}
