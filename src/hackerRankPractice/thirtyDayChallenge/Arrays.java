package hackerRankPractice.thirtyDayChallenge;

import java.util.Scanner;

/*

Objective
Today, we're learning about the Array data structure.

Task
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N (the size of our array).
The second line contains N space-separated integers describing array A's elements.

Constraints     1 <= N <= 1000
                1 <= Ai <= 10000, where Ai is the ith integer in the array.

Output Format

Print the elements of array A in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

*/


class Solution7 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // user scanner to get user input for Array size
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // initialize int Array
        int[] arr = new int[n];

        // initialize String array
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for loop to create int array
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        int[] secondArray = new int[arrItems.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            secondArray[j] = Integer.parseInt(arrItems[i]);
            System.out.print(secondArray[j] + " ");
            j++;
        }
    }
}

/*

DATA STRUCTURES
A way of organizing data that enables efficient storage, retrieval, and use.

ARRAYS
A type of data structure that stores elements of the same type (generally).
It's important to note that you'll often see arrays referred to as A in documentation,
but the variable names you use when coding should be descriptive and begin with lowercase letters.

You can think of an array, A, of size n as a contiguous block of cells sequentially indexed from 0 to n - 1
which serve as containers for elements of the array's declared data type. To store an element, value,
in some index i of array A, use the syntax A[i] and treat it as you would any other variable
(i.e., A[i] = value;). For example, consider the following code:

*/

public class Arrays {

    public void array() {

        // the number of elements we want to hold
        final int _arraySize = 4;

        // our array declaration
        String[] stringArray = new String[_arraySize];

        // for loop
        for (int i = 0; i < _arraySize; i++) {
            // assign value to index i
            stringArray[i] = "This is stored in index " + i;

            // print value saved in index i
            System.out.println(stringArray[i]);
        }
    }
}
/*

The code above saves and then prints the values listed below in their respective indices of stringArray:

This is stored in index 0
This is stored in index 1
This is stored in index 2
This is stored in index 3

Most languages also have a method, attribute, or member that allows you to retrieve the size of an array.
In Java, arrays have a length attribute; in other words, you can get the length of some array, arrayName,
by using the arrayName.length syntax.

Note: The final keyword used in the code above is a means of protecting the variable's value by locking
it to its initialized value. Any attempt to reassign (overwrite) the value of a final variable will generate an error.

*/