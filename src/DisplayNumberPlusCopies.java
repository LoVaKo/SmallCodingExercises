/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that accepts an integer (n) and displays n + nn + nnn.
Sample Output:

Input number: 5
5 + 55 + 555

 */
import java.util.Scanner;
public class DisplayNumberPlusCopies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        System.out.println(n + " + " + n + n + " + " + n + n + n);
        sc.close();
    }
}
