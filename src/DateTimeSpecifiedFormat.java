/*
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to display the current date time in specific format.
Sample Output:

Now: 2017/06/16 08:52:03.066
HINTS: Googling Java formatting DateTime gives https://docs.oracle.com/javase/8/
docs/api/java/time/format/DateTimeFormatter.html
as well as https://www.baeldung.com/java-datetimeformatter

 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSpecifiedFormat {
    public static void main(String[] args) {
        System.out.println("Now: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss.SSS")));
    }
}
