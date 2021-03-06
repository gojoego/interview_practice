package hackerRankPractice.thirtyDayChallenge;

/*

Objective: In this challenge, we're getting started with conditional statements.

Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format: A single line containing a positive integer, n.

Constraints: 1 <= n <= 100

Output Format: Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0: 3
Sample Output 0: Weird

Sample Input 1: 24
Sample Output 1: Not Weird

Explanation

Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

*/

import java.util.Scanner;

public class IntroConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 2 <= N && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && 6 <= N && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 20 && N<=100) {
            System.out.println("Not Weird");
        }
    }
}

/*

BOOLEAN
A logical statement that evaluates to true or false. In some languages, true is interchangeable with the number 1
and false is interchangeable with the number 0.


CONDITIONAL STATEMENTS
These are a way of programming different work-flows depending on some boolean condition.
The if-else statement is probably the most widely used conditional in programming,
and its workflow is demonstrated below:

The basic syntax used by Java (and many other languages) is:

if(condition) {
    // do this if 'condition' is true
}
else {
    // do this if 'condition' is false
}
where condition is a boolean statement that evaluates to true or false.
You can also use an if without an else, or follow an if(condition) with else if(secondCondition)
if you have a second condition that only need be checked when condition is false.
If the if (or else if) condition evaluates to true, any other sequential statements connected to it
(i.e.: else or an additional else if) will not execute.

LOGICAL OPERATORS
Customize your condition checks by using logical operators. Here are the three to know:

|| is the OR operator, also known as logical disjunction.
&& is the AND operator, also known as logical conjunction.
! is the NOT operator, also known as negation.

Here are some usage examples:

// if A is true and B is true, then C
if(A && B){
    C;
}

// if A is true or B is true, then C
if(A || B){
    C;
}

// if A is false (i.e.: not true), then B
if(!A){
    B;
}

Another great operator is the ternary operator for conditional statements (? :).
Let's say we have a variable, v, and a condition, c. If the condition is true, we want v to be assigned the value of a;
if condition c is false, we want v to be assigned the value of b. We can write this with the following simple statement:

v = c ? a : b;

In other words, you can read c ? a : b as "if c is true, then a; otherwise, b".
Whichever value is chosen by the statement is then assigned to v.


SWITCH STATEMENT
This is a great control structure for when your control flow depends on a number of known values.
Let's say we have a variable, condition, whose possible values are val0, val1, val2, and each value
has an action to perform (which we will call some variant of behavior).
We can switch between actions with the following code:

switch (condition) {
    case val0: 	behavior0;
                break;
    case val1:	behavior1;
                break;
    case val2:	behavior2;
                break;
    default: 	behavior;
                break;
}
Note: Unless you include break; at the end of each case statement, the statements will execute sequentially.
Also, while it's good practice to include a default: case (even if it's just to print an error message),
it's not strictly necessary.

*/

























