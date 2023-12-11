/*
https://www.codezclub.com/java-program-sum-two-numbers-input-value-keyboard/
Make a program that lets the user input two numbers, and then shows the result
of adding them.

Example run:
Enter the first number: 3
Enter the second number: 5
The sum is: 8

 */
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
