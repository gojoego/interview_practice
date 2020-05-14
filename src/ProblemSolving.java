import java.lang.reflect.Array;

public class ProblemSolving {

    public static void main(String[] args) {

    }

    // #1 come up with a brute-force solution

    int[] arrayFirst = new int[]{-1, 3, 8, 2, 9, 5};

    int[] arraySecond = new int[]{4, 1, 2, 10, 5, 20};

    // assume: both arrays same length

    // task: find the pairs of numbers, with one number from each array, that get closest to 24 when added together

    // pairs: (5,20) and (3,20)

    // #2 think of a simpler version of the problem

    // take first set and compare each in second set for closest to 24
    // O(n)
    // O(x*n)

    // #3 think with simpler examples- try noticing a pattern

    int[] arrayThird = new int[]{7, 4, 1, 10};
    int[] arrayFourth = new int[]{4, 5, 8, 7};
    // target: 13

    /*
        4   5   8   7
    7   11  12  15  14
    4   8   9   12  11
    1   5   6   9   8
    10  14  15  18  17

    */

    // #4 use some visualization


    // #5 test your solution on a few examples

    // Time:    O(nlogn)
    // Space:   O(n)



}


// from CS Dojo: https://www.youtube.com/watch?v=GBuHSRDGZBY