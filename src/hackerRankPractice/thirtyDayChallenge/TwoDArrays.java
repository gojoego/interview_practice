package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today, we're building on our knowledge of Arrays by adding another dimension.

Context
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
*/

public class TwoDArrays {

    public static void main(String[] args) {

    }

/*

2D Arrays
Also known as multidimensional arrays, they are very similar to the regular 1D Array data
structure we've already discussed.

Consider the following code:

*/

    int rowSize = 2;
    int colSize = 4;
    int[][] myArray = new int[rowSize][colSize];

    /*

    This creates a 2x4 matrix where each element, (i,j),
    can be graphically represented as follows:

    (0, 0) (0, 1) (0, 2) (0, 3)
    (1, 0) (1, 1) (1, 2) (1, 3)

    You may find it helpful to think of these (i,j) elements in terms of real-world structures
    such as the cells in a spreadsheet table.

    To fill the array's cells with values, you can use a nested loop.
    The outer loop represents the matrix's rows and uses i as its variable,
    and the inner loop represents the matrix's columns and uses j as its variable.
    The code below assigns the value of count to each element in the 2D array we
    declared previously:

    */
    public void nestedLooping() {
        int count = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
            }
        }
    }

/*

If we print the contents of each row:

*/
    public void nestedLoopingPrinting() {
        for (int i = 0; i < rowSize; i++) {
            // print the row of space-separated values
            for (int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
    }
}

/*

we'll see the following output:

0 1 2 3
4 5 6 7

review

1. class vs instance
   class: user defined blueprint or prototype from which objects are created
   instance:
        -instance of a class in java is the object of that class itself
        -something which represents the type of a particular java class
2. constructors: special method that is used to initialize objects
3. fields: variable inside a class
4. parameters:
    -refers to the list of variables in a method declaration
    -arguments are the actual values that are passed in when the method is invoked
    -when you invoke a method, the arguments used must match the declaration's
        parameters in type and order
5. data types: values that a variable can take
6. return types: defines and constrains the data type of the value returned from a method
7. print statements: call to the print or println method of the System. out object
8. arrays: container object that holds a fixed number of values of a single type
9. dictionaries: util.Dictionary is an abstract class,
        representing a key-value relation and works similar to a map
10. recursion: process in which a method calls itself continuously
11. binary numbers: uses 0s and 1s to represent numbers


*/




































