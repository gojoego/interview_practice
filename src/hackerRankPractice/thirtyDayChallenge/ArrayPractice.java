package hackerRankPractice.thirtyDayChallenge;

import java.util.Arrays;

/*

array:  a container object that holds a fixed number of values that have a single data type;
        always fixed length

*/

public class ArrayPractice {

    public static void main(String[] args) {

        // Index  0  1  2  3  4
        // Array [0, 5, 3, 2, 1] -> length 5

        // Index    0       1        2
        // Array ["bob", "sally", "max"] -> length 3

        // Declaring, Allocating, Initializing Arrays

        // 1st way to initialize an array

        int[] intArray1;

        // 2nd way to initialize an array

        int[] intArray2 = new int[4];

        // 3rd way to initialize an array

        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        // print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        // initializing intArray2
        // name[index] = desiredValue
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
    }
}

/*



 */






