/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

 */

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        // Area of a circle
        double r = 7.5;
        double A = Math.PI * (r*r);
        System.out.println(A);

        // Circumference of a circle
        double C = 2 * Math.PI * r;
        System.out.println(C);

    }
}
