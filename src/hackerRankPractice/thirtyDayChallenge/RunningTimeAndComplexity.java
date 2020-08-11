package hackerRankPractice.thirtyDayChallenge;

/*

Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Given a number, n, determine and print whether it's Prime or Not Prime.

NOTE:

If possible, try to come up with a O(logn) primality algorithm,
or see what sort of optimizations you come up with for an O(n) algorithm.
Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, T, the number of test cases.
Each of the  subsequent lines contains an integer, T, to be tested for primality.

Output Format

For each test case, print whether N is Prime or Not Prime on a new line.

Sample Input    3
                12
                5
                7

Sample Output   Not prime
                Prime
                Prime

*/

import java.util.Scanner;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input for number of numbers
        int numberOfNumbers = scanner.nextInt();

        // declare int array
        int[] inputArray = new int[numberOfNumbers];

        // for loop
        for (int i = 0; i < numberOfNumbers; i++) {
            inputArray[i] = scanner.nextInt();
        }


        for (int index : inputArray) {
            if (isPrime(index) && index != 1 || index == 2){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

/*

ASYMPTOTIC ANALYSIS
-means of discussing general efficiency of an algorithm

when discussing time complexity of algorithm, use
the positive integer n to represent the size of the data set it processes.
To evaluate the actual algorithm, we must ignore machine-dependent constants
(i.e., think about the number of instructions being executed, not about how
fast a certain machine can execute them) and look at its growth rate as n
approaches [infinity] (i.e., how does it grow as a function of time —
especially as n gets large?).

here are the terms you need to know:
1.  f(n) = Θ(g(n))
    f(n) is Theta of g(n) if and only if there exists some positive constants c1, c2, and n0 such that
    c1 * g(n) <= f(n) <= c2 * g(n) whenever n > n0
    In short, f(n) is bounded both above and below by g(n) because after some point n0, f(n) and g(n)
    have the same growth rate
2.  f(n) = O(g(n))
    f(n) is O ("oh" or "big oh" of g(n) if and only if there exists some positive constants c and n0 such that
    f(n) <= c * g(n) whenever n > n0
    in short, f(n) is bounded above by g(n) because after some point n0, g(n) will always grow at a larger
    asymptotic growth rate than f(n)
3.  f(n) is Omega ("big omega") of g(n) if and only if there exists some positive constants c and n0 such
    that f(n) <= c * g(n) whenever n > n0
    in short, f(n) is bounded above by g(n) because after some point n0, g(n) will always grow at a larger
    asymptotic growth rate than f(n)

The term Θ(1) time or "constant time" is used to refer to fundamental operations that take a constant
amount of time to execute (e.g. reading a single value, performing a comparison between two values, checking a
condition, etc.)

At a very basic level, you need to think about how many instructions your algorithm must execute in the best
and worst scenarios when processing n pieces of data. Then determine the function(s) that your algorithm is bounded
above and below by, disregarding any leading constants (e.g. 1/2, 2, etc.) or lower-order terms (e.g. x is
a lower-order term than x^2); basically you don't hang on to anything that doesn't directly impact the growth rate of
f(n) and you only want to retain the term that has the greatest impact on growth rate
(e.g., if f(n) = 3 * n^7 + n + 2, then f(n) is O(n^7)

EXAMPLE

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n/2; j++) {
        // Θ(1) operation
        // Θ(1) operation
        // Θ(1) operation
    }
}

In the nested loop above, there are three constant time operations that will be performed n * n/2 times
as a result of the nested loops. Because f(n) = 3 * n * n/2 = 3/2 * n^2, our code is O(n^2)

PRIMALITY ALGORITHMS
A prime number is a natural number greater than 1 that is only divisible by 1 and itself (note that 1 is not a prime).
A primality algorithm is an algorithm for determining if some number, n, is prime.

The most basic primality algorithm is to simply iterate through each integer i
(where 1 < i < n) and determine if it evenly divides n;
if i is an even divisor of n, then n is not prime.

While this algorithm is O(n), there are a number of optimizations you can perform that will reduce it to O(n^.5)
(even that can be slightly improved upon, though we will not discuss it here)

*/
























