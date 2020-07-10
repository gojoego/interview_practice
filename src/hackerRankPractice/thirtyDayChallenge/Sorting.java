package hackerRankPractice.thirtyDayChallenge;

/*



 */

public class Sorting {
}

/*

SORTING
Sorting is the act of ordering elements. The ability of a program to organize
and retrieve data quickly and efficiently is incredibly important in software development.
Learning how to effectively sort and retrieve the data you're working with enables you to
write better, faster algorithms.

BUBBLE SORT
This is a very simple sorting algorithm. Because it's also very inefficient,
Bubble Sort is not practical for real-world use and is generally only discussed
in an academic context. The basic theory behind BubbleSort is that you take an
array of integers and iterate through it; for each element at some index i whose
value is greater than the element at the index following it (i.e., index ), you
must swap the two values. The act of swapping these values causes the larger,
unsorted values to float to the back (like a bubble) of the data structure until
they land in the correct location.

Implementation:

*/

class SortingExample {

    private static void printArray(String s, int[] x) {
        // printing every index of the array
        System.out.print(s + " Array: ");

        // for each loop
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] x) {
        printArray("Initial", x);

        // last position is length minus one because counting indices starts at zero
        int endPosition = x.length - 1;
        int swapPosition;

        while (endPosition > 0) {
            swapPosition = 0;
            for (int i = 0; i < endPosition; i++){
                if (x[i] > x[i + 1]) {
                    // swap elements 'i' and 'i + 1':
                    int tmp = x[i]; // temporary value for making the swap
                    x[i] = x[i + 1]; // swap elements set equal to each other
                    x[i + 1] = tmp; // temporary value set to the swapped value

                    swapPosition = i;
                } // ending if statement
                printArray("Current", x);
            } // ending for loop

            endPosition = swapPosition;
        } // ending while loop
    }
}
















