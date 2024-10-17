import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
       System.out.println("Welcome to Compound Interest Calculator.....");
       Scanner ci = new Scanner(System.in);
       System.out.print("Enter Principle Amount : "); 
       float p = ci.nextFloat();
       System.out.print("Enter Rate of Interest : ");
       float r = ci.nextFloat();
       System.out.print("Enter the Time : ");
       float t = ci.nextFloat();
       System.out.print("Compound Interest : "+(p*(1+r/100)*t));
    }
}
