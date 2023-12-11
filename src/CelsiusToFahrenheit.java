/*
Make a program that converts temperatures in centigrade to temperatures in
Fahrenheit.
Input:
Enter temperature in Centigrade: 30

Temperature in Fahrenheit is: 86.0

 */
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Centigrade: ");
        double celsius = sc.nextInt();
        double fahrenheit = ((double) 9/5) * celsius + 32;
        System.out.println("Temperature in fahrenheit: " + fahrenheit);
    }
}
