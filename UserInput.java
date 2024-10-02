import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Welcome, "+name+ " to Java Learning Sessions !");
    }
}
