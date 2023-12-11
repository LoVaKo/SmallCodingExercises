/*
https://codingbat.com/prob/p178986
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given
3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 30, 7) → false

 */
/*
https://codingbat.com/prob/p165701
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given
2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
public class HasTeen {
    public static boolean hasTeen(int x, int y, int z) {
        return (x > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20);
    }

    public static boolean loneTeen(int x, int y) {
        return ((x > 12 && x < 20) && !(y > 12 && y < 20)) || (!(x > 12 && x < 20) && (y > 12 && y < 20));
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 30, 7));
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21,19));
        System.out.println(loneTeen(13, 13));
    }
}
