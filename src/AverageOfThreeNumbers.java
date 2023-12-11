/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes three numbers as input to calculate and print
the average of the numbers

 */
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AVERAGE CALCULATOR");
        System.out.print("Input first number: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input second number: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input third number: ");
        int thirdNum = scanner.nextInt();
        scanner.nextLine();

        int result = (firstNum + secondNum + thirdNum)/3;
        System.out.printf("The average of %d, %d, and %d is %d.", firstNum, secondNum, thirdNum, result);

        scanner.close();
    }
}
