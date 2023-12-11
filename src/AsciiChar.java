/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the ascii value of a given character.
Expected Output

The ASCII value of Z is: 90

 */

public class AsciiChar {
    public static void main(String[] args) {
        char l = 'L';
        System.out.printf("The ASCII value of %c is %d", l, (int) l);
    }
}
