package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class Recursion {
}

/*

RECURSION
This is an algorithmic concept that involves splitting a problem into two parts:
a base case and a recursive case. The problem is divided into smaller sub-problems
which are then solved recursively until such time as they are small enough and meet
some base case; once the base case is met, the solutions for each sub-problem are
combined and their result is the answer to the entire problem.

If the base case is not met, the function's recursive case calls the function again with modified values. The code must be structured in such a way that the base case is reachable after some number of iterations, meaning that each subsequent modified value should bring you closer and closer to the base case; otherwise, you'll be stuck in the dreaded infinite loop!

Example
The code below produces the multiple of two numbers by combining addition and recursion:

// Multiply 'n' by 'k' using addition:
private static int nTimesK(int n, int k) {
    System.out.println("n: " + n);
    // Recursive Case
    if(n > 1) {
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
When executed, this code prints:

n: 4
n: 3
n: 2
n: 1
Result: 16
The diagram below depicts the execution of the code above. Each call to  is represented by a bubble, and each new recursive call bubble is stacked inside and on top of the bubble that was responsible for calling it. The function recursively calls itself using reduced values until it reaches the base case (). Once it reaches the base case, it passes back the base case's return value () to the bubble that called it and continues passing back k + the previously returned value until the final result (i.e.: the multiplication by addition result of ) is returned.

Recursion 2.png

Once the code hits the base case in the  bubble, it returns  (which is ) to the  bubble.
Then the  bubble returns , which is , to the  bubble.
Then the  bubble returns , which is , to the  bubble.
Then the  bubble returns , which is , to the first line in main as the result for , which assigns  to the  variable.

*/