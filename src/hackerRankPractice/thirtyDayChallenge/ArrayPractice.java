package hackerRankPractice.thirtyDayChallenge;

import java.util.Arrays;

/*

array:  a container object that holds a fixed number of values that have a single data type;
        always fixed length

*/

public class ArrayPractice {

    public static void printArray(int[] array){
        System.out.print("[");
        // retrieving items from array using index
        for (int i = 0; i < array.length; i++){
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array){
        System.out.print("[");
        // retrieving items from array using index
        for (int i = 0; i < array.length; i++){
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

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
        System.out.println("array before complete initialization:");
        printArray(intArray2);
        System.out.println();

        // initializing intArray2
        // name[index] = desiredValue
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // 3rd way to initialize an array

        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        // print out Arrays
        System.out.println("2nd int Array: " + Arrays.toString(intArray2));
        System.out.println("3rd int Array: " + Arrays.toString(intArray3));
        System.out.println();

        // custom print out arrays
        System.out.println("using custom print:");
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // retrieve objects
        System.out.println("value of third index in 2nd int Array: " + intArray2[3]);
        System.out.println();

        // given functions
        Arrays.sort(intArray3);
        System.out.println("after using given sort function:");
        printArray(intArray3);
        System.out.println();

        // print String array
        System.out.println("using printArray function for Strings:");
        printArray(shoppingList);

        // special for loop: foreach loop
        System.out.println("Special For Loop:");
        for (String s : shoppingList){
            System.out.print(s);
            System.out.print(" ");
        }
    }
}

/*



 */






