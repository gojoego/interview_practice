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

This creates a 2x4 matrix where each element, , can be graphically represented as follows:

(0, 0) (0, 1) (0, 2) (0, 3)
(1, 0) (1, 1) (1, 2) (1, 3)
You may find it helpful to think of these  elements in terms of real-world structures such as the cells in a spreadsheet table.

To fill the array's cells with values, you can use a nested loop. The outer loop represents the matrix's rows and uses  as its variable, and the inner loop represents the matrix's columns and uses  as its variable. The code below assigns the value of  to each element in the 2D array we declared previously:

int count = 0;

for(int i = 0; i < rowSize; i++) {

    for(int j = 0; j < colSize; j++, count++) {
        myArray[i][j] = count;
    }
}
If we print the contents of each row:

/*
for(int i = 0; i < rowSize; i++) {

    // print the row of space-separated values
    for(int j = 0; j < colSize; j++) {
        System.out.print(myArray[i][j] + " ");
    }
    // end of row is reached, print newline
    System.out.println();
}


 */
}

/*
we'll see the following output:

0 1 2 3
4 5 6 7

*/