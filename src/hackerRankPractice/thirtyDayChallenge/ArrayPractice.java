package hackerRankPractice.thirtyDayChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*

Arrays  -a container object that holds a fixed number of values that have a single data type;
        -always fixed length
        -declare, allocate, initialize
        -no mixing data types in an Array
        -changing object at index
            1. variableName[index] = newObject
            2. once changed, original is GONE
        -get object at index: variableName[index]
        -can use given java methods from the Array class

When you reference an object and use ".", you can use properties and methods that go with object.
IDE should have dropdown that shows options in which you should be able to tell properties and methods apart
from each other. These are called instance methods and they are useful if you do not know what to do.

FOR LOOPS
for(int i = 0l i < length; i++){
    print -> array[i]
}

FOR EACH LOOPS
for(String s : array){
    print -> s
}

*/

public class ArrayPractice {

    public static <E> void printArray(E[] array){
        System.out.println("[");
        for (E element: array) {
            System.out.println(element);
        }
    }

/*
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
*/


    public static void main(String[] args) {

        // Index  0  1  2  3  4
        // Array [0, 5, 3, 2, 1] -> length 5

        // Index    0       1        2
        // Array ["bob", "sally", "max"] -> length 3

        // random objects from Array
        // Math.abs(random.nextInt()) % length;

        // Declaring, Allocating, Initializing Arrays

        // 1st way to initialize an array

        Integer[] intArray1;

        // 2nd way to initialize an array

        Integer[] intArray2 = new Integer[4];
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

        Integer[] intArray3 = {5, 2, 9, 1, 3};

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
        System.out.println("using instance methods of Array object: " + Array.get(intArray2, 3));
        System.out.println();

        // given functions
        Arrays.sort(intArray3);
        System.out.println("after using given sort function:");
        printArray(intArray3);
        System.out.println();

        // print String array
        System.out.println("using printArray function for Strings:");
        printArray(shoppingList);
        System.out.println();

        // special for loop: foreach loop
        System.out.println("Special For Loop:");
        for (String s : shoppingList){
            System.out.print(s);
            System.out.print(" ");
        }
        // do not always have to use given iterator
    }
}

/*



 */






