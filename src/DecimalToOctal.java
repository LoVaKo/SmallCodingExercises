/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a decimal number to octal number. G
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
** HINT: Check the Java standard library. You're working with whole numbers
here, so Integer (the wrapper class of int,
as int is a primitive and therefore cannot have any methods) may be of use :)
as int is a primitive and therefore cannot have any methods) may be of use :)
Of course, feel free to write your
   own implementation if you want...

 */
import java.util.Scanner;
import static java.lang.Integer.toOctalString;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number would you like to convert?");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("The octal value is: " + toOctalString(number));
    }
}
