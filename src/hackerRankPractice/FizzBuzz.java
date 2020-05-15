package hackerRankPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }
    /*

    Given a number n, for each integer i in the range from 1 to n inclusive,
    print one value per line as follows:

        if i is a multiple of both 3 and 5, print FizzBuzz
        if i is a multiple of 3(but not 5), print Fizz
        if i is a multiple of 5(but not 3), print Buzz
        if i is not a multiple of 3 or 5, print value of i

    Function Description

        fizzBuzz has the following parameters(s):
        int n: upper limit of values to test (inclusive)
        Returns: NONE
        Prints: The function must print the appropriate response for each value i in the set {1, 2, ...n}
                in ascending order, each on a separate line.

    Constraints: 0 < n < 2 x 10^5


    */

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i % 5 == 0)
                System.out.println("Buzz");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i % 3 == 0)
                System.out.println("Fizz");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers
                System.out.println(i);
        }
    }
}
