import java.util.*;
public class TemperatureCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to Fahrenheit to Celsius Calculator.......");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenheit Reading : ");
        float f = sc.nextFloat();
        System.out.print("Celsius Reading : "+(f-32)*5/9);
    }
}
