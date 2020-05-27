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

public class Arrays {
}

class Solution7 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
    }
}

/*

Data Structures
A way of organizing data that enables efficient storage, retrieval, and use.

Arrays
A type of data structure that stores elements of the same type (generally). It's important to note that you'll often see arrays referred to as  in documentation, but the variable names you use when coding should be descriptive and begin with lowercase letters.

You can think of an array, , of size  as a contiguous block of cells sequentially indexed from  to  which serve as containers for elements of the array's declared data type. To store an element, , in some index  of array , use the syntax A[i] and treat it as you would any other variable (i.e., A[i] = value;). For example, the following code:

// the number of elements we want to hold
final int _arraySize = 4;

// our array declaration
String[] stringArray = new String[_arraySize];

for(int i = 0; i < _arraySize; i++) {
    // assign value to index i
    stringArray[i] = "This is stored in index " + i;

    // print value saved in index i
    System.out.println(stringArray[i]);
}
saves and then prints the values listed below in their respective indices of :

This is stored in index 0
This is stored in index 1
This is stored in index 2
This is stored in index 3
Most languages also have a method, attribute, or member that allows you to retrieve the size of an array. In Java, arrays have a  attribute; in other words, you can get the length of some array, arrayName, by using the arrayName.length syntax.

Note: The final keyword used in the code above is a means of protecting the variable's value by locking it to its initialized value. Any attempt to reassign (overwrite) the value of a final variable will generate an error.

*/