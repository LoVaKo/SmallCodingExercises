// Write a Java program to divide two numbers and print on the screen.
// I made it fancier with user input :)

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What number do you want to divide?");
        double x = input.nextDouble();

        System.out.println("What number do you want to divide it by?");
        double y = input.nextDouble();
        double result = x / y;

        System.out.println("Your result: " + x + " / " + y + " = " + result);
        input.close();

    }
}
