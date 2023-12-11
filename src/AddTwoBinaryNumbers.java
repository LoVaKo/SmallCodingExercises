import java.util.Scanner;

/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101

** HINT: it can be fun to make your own method to convert a number or String to
a binary number. But one thing to
** learn on the road to becoming a professional is that Java has LOTS of useful
methods already inbuilt. Check
** the wrapper class of int, Integer! :)

 */
public class AddTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String firstNum = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String secondNum = scanner.nextLine();

        int numOne = Integer.parseInt(firstNum, 2);
        int numTwo = Integer.parseInt(secondNum, 2);

        int addedUp = numOne + numTwo;
        String result = Integer.toBinaryString(addedUp);

        System.out.println("Sum of two binary numbers: " + result);
    }
}
