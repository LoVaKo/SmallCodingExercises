/*
https://codingbat.com/prob/p186759
Given a string, return true if the first instance of "x" in the string is
immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
    public static boolean doubleX(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == 'x' && array[i+1] == 'x') return true;
        }
        return false;
    }
}
