/*
https://codingbat.com/prob/p136041
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears
in the array somewhere.
You can use an array123(int... numbers) varargs method to automatically convert
a sequence of ints to an array

array123(1, 1, 2, 3, 1) → true
array123(1, 1, 2, 4, 1) → false
array123(1, 1, 2, 1, 2, 3) → true

 */
public class Array123 {
    public static boolean array123(int... numbers) {
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == 1 && numbers[i+1] == 2 && numbers[i+2] == 3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(array123(1,1,2,3,1));
        System.out.println(array123(1,1,2,4,1));
        System.out.println(array123(1,1,2,1,2,3));
    }
}
