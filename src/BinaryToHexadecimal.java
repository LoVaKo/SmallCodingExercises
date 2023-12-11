/*
Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

Hexadecimal value: D
 */
import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.next();
        int binaryNumber = Integer.parseInt(binaryString, 2);
        String hexadecimal = Integer.toHexString(binaryNumber);
        System.out.println("Hexadecimal value: " + hexadecimal);
    }
}
