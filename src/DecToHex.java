/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
** HINT: Check the Java standard library. You're working with whole numbers
here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)

 */
public class DecToHex {
    public static String DecToHex(int number) {
        return Integer.toHexString(number);
    }

    public static void main(String[] args) {
        System.out.println(DecToHex(15));
    }
}
