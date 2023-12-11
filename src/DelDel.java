/*
https://codingbat.com/prob/p100905
Given a string, if the string "del" appears starting at index 1, return a
string where that "del" has been deleted. Otherwise, return the string
unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

 */
public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    public static String delDel(String str) {
        String first = str.substring(0,1);
        String del = str.substring(1,4);
        String last = str.substring(4);

        if (del.equals("del")) return first + last;
        else return str;
    }
}
