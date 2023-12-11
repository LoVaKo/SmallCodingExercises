/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to display the system time.
Sample Output:

Current Date time: Sun Apr 02 16:16:01 CEST 2023
HINT: check formatting strings for datetimes, and since this exercise mentions
SYSTEM time, the System class as well...

 */
import java.time.LocalDateTime;

public class DisplayTIme {
    public static void main(String[] args) {
        System.out.println("Current date and time: " + LocalDateTime.now());
    }
}
