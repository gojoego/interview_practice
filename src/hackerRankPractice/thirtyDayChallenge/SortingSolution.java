package hackerRankPractice.thirtyDayChallenge;

import java.util.Scanner;

public class SortingSolution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++){
         a[a_i] = in.nextInt();
        }
        // bubble sort method

        // track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        // for loop to iterate through array
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n - 1; j++){

                // swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            // if no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0){
                break;
            }
        }

        // print number of swaps
        // print value in first index a[0]
        // print value in last index a[a.length-1]
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
