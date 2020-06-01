package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today, we're learning and practicing an algorithmic concept called Recursion.

Recursive Method for Calculating Factorial

factorial(N) =  1                   N <= 1
                N x factorial(N-1)  otherwise

Task
Write a factorial function that takes a positive integer,
N as a parameter and prints the result of N!(N factorial).

Note: If you fail to use recursion or fail to name your recursive function
factorial or Factorial, you will get a score of 0.

Input Format

A single integer, N (the argument to pass to factorial).

Constraints     2 <= N <= 12
                your submission must contain a recursive function named factorial

Output Format

Print a single integer denoting N!.

Sample Input 3

Sample Output 6

Explanation

Consider the following steps:

1. factorial(3) = 3 x factorial(2)
2. factorial(2) = 2 x factorial(1)
3. factorial(1) = 1

From steps 2 and 3, we can say factorial(2) = 2 x 1 = 2;
then when we apply the value from factorial(2) to step 1, we get factorial(3)=3x2x1=6.
Thus, we print 6 as our answer.

*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

    }
/*

RECURSION
This is an algorithmic concept that involves splitting a problem into two parts:
a base case and a recursive case. The problem is divided into smaller sub-problems
which are then solved recursively until such time as they are small enough and meet
some base case; once the base case is met, the solutions for each sub-problem are
combined and their result is the answer to the entire problem.

If the base case is not met, the function's recursive case calls the function again
with modified values. The code must be structured in such a way that the base case is
reachable after some number of iterations, meaning that each subsequent modified value
should bring you closer and closer to the base case; otherwise, you'll be stuck in the
dreaded infinite loop!

Example
The code below produces the multiple of two numbers by combining addition and recursion:

*/

    // Multiply 'n' by 'k' using addition:
    private static int nTimesK(int n, int k) {
        System.out.println("n: " + n);
        // Recursive Case
        if (n > 1) {
            return k + nTimesK(n - 1, k);
        }
        // Base Case n = 1
        else {
            return k;
        }
    }

    public static void recursiveFunction() {
        int result = nTimesK(4, 4);
        System.out.println("Result: " + result);
    }
}

/*

When executed, this code prints:

n: 4
n: 3
n: 2
n: 1

Result: 16

The diagram below depicts the execution of the code above.
Each call to nTimesK is represented by a bubble, and each new recursive call bubble
is stacked inside and on top of the bubble that was responsible for calling it.
The function recursively calls itself using reduced values until it reaches the
base case (n = 1). Once it reaches the base case, it passes back the base case's
return value (k = 4) to the bubble that called it and continues passing back k +
the previously returned value until the final result (i.e.: the multiplication
by addition result of n x k) is returned.

Once the code hits the base case in the 4th bubble, it returns k (which is 4)
to the 3rd bubble.
Then the 3rd bubble returns k + 4, which is 8, to the 2nd bubble.
Then the 2nd bubble returns k + 8, which is 12, to the 1st bubble.
Then the 1st bubble returns k + 12, which is 16, to the first line in main as
the result for nTimesK(4,4), which assigns 16 to the result variable.

What is recursion?

The process of defining a function or calculating a number by the repeated
application of an algorithm

recursion consists of:

1. base case: when we stop repeating our algorithm
2. recursive case: repeating the algorithm

*/














































