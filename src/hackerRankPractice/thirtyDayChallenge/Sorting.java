package hackerRankPractice.thirtyDayChallenge;

/*

TASK
Given an array, a, of size n distinct elements, sort the array
in ascending order using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

1.  Array is sorted in numSwaps swaps.
    where numSwaps is the number of swaps that took place.
2.  First Element: firstElement
    where firstElement is the first element in the sorted array.
3.  Last Element: lastElement
    where lastElement is the last element in the sorted array.

Hint: To complete this challenge, you will need to add a variable that
keeps a running tally of all swaps that occur during execution.

Input Format

The first line contains an integer, n, denoting the number of elements in array a.
The second line contains n space-separated integers describing the respective values of a0, a1,..., an-1.

Constraints:    2 <= n <= 600
                1 <= ai <= 2 x 10^6, where 0 <= i < n

Output Format

Print the following three lines of output:

1.  Array is sorted in numSwaps swaps.
    where numSwaps is the number of swaps that took place.
2.  First Element: firstElement
    where firstElement is the first element in the sorted array.
3.  Last Element: lastElement
    where lastElement is the last element in the sorted array.

Sample Input 0      3
                    1 2 3

Sample Output 0     Array is sorted in 0 swaps.
                    First Element: 1
                    Last Element: 3

Explanation 0

The array is already sorted, so 0 swaps take place and we
print the necessary 3 lines of output shown above.

Sample Input 1      3
                    3 2 1

Sample Output 1     Array is sorted in 3 swaps.
                    First Element: 1
                    Last Element: 3

Explanation 1

The array a = [3, 2, 1] is not sorted, so we perform the following 3 swaps:

    1. [3, 2, 1] -> [2, 3, 1]
    2. [2, 3, 1] -> [2, 1, 3]
    3. [2, 1, 3] -> [1, 2, 3]

At this point the array is sorted and we print the necessary 3 lines of output shown above.

*/

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        // bubble sorting example
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = scanner.nextInt();
        }
        scanner.close();

        SortingExample1.bubbleSort(unsorted);

    }
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

class SortingExample1 {

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
            for (int i = 0; i < endPosition; i++) {
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

        printArray("Sorted", x);
    } // ending bubbleSort

}

class SortingExample2 {
    public void SortingExample2() {
        int n = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                int[] a = new int[0];
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
    }
    private void swap(int i, int i1) {
    }
}
















