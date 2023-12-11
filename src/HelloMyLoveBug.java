/*
https://edabit.com/challenge/fY3bzat74jGhLMepS
Emmy has written a function that returns a greeting to users. However, she's in
love with Mubashir, and would like to greet him slightly differently. She added
a special case in her function, but she made a mistake.

Can you help her?

Examples
greeting("Matt") ➞ "Hello, Matt!"
greeting("Helen") ➞ "Hello, Helen!"
greeting("Mubashir") ➞ "Hello, my Love!"
 */
public class HelloMyLoveBug {
    public static void main(String[] args) {
        System.out.println(greeting("Mubashir"));
    }

    public static String greeting(String name) {

        if(name == "Mubashir") {
            return "Hello, my Love!";
        }
        return "Hello, " + name + "!";

    }
}
