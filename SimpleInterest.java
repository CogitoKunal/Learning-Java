import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest Calculator.....");
        Scanner si=new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        float p=si.nextFloat();
        System.out.print("Enter the rate : ");
        float r=si.nextFloat();
        System.out.print("Enter the Time : ");
        float t=si.nextFloat();
        System.out.print("Simple Interest = "+((p*r*t)/100)); 
    }}
