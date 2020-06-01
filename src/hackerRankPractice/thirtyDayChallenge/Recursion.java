package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class Recursion {


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

    public static void main(String[] args) {
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

The process of defining a function or calculating a number by the repeated application of an algorithm

recursion consists of:

1. base case: when we stop repeating our algorithm
2. recursive case: repeating the algorithm



*/














































