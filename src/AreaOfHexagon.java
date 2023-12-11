/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6.0
Expected Output

The area of the hexagon is: 93.53074360871938

 */
import java.util.Scanner;
import static java.lang.Math.tan;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the side of the hexagon: ");
        double s = 0;
        while (s == 0) {
            if (scanner.hasNextDouble()) {
                s = scanner.nextDouble();
            } else {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
        System.out.println(s);
        double hexagonArea = (6 * Math.pow(s, 2))/(4*tan(Math.PI/6));
        System.out.println("The area of the hexagon is: " + hexagonArea);
    }
}
