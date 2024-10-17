import java.util.*;
public class PositiveCheck {
    public static void main(String[] args){
        System.out.println("Let's Check number is positive or not....");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number to be Checked : ");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("Entered Number is Zero");
        }else{
            if(a>0){
                System.out.println("Entered Number is Positive...");
        }
        else{
            System.out.println("Entered Number is Negative....");
        }
    }
}}
