import java.util.Scanner;

/*
Calculate the factorial of a number: the factorial is the number x number -1 x
number - 2 .. 1
So 1! = 1, 2! = 2x1 = 2, 3! = 3 x 2 x 1 = 6, 4! = 4 x 3 x 2 x 1 = 24 etc.
See also https://en.wikipedia.org/wiki/Factorial

Sample run:
Please enter an integer greater than zero: 5
The factorial of 5 is 120

 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer greater than zero: ");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.printf("The factorial of %d is %d", num, result);
        scanner.close();
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }

    }
}
