package hackerRankPractice.thirtyDayChallenge;

/*

Objective:
In this challenge, you'll work with arithmetic operators.

Task:
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format

There are 3 lines of numeric input:
The first line has a double, mealCost (the cost of the meal before tax and tip).
The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
The third line has an integer, taxPercent (the percentage of mealCost being added as tax).

Output Format

Print the total meal cost, where totalCost is the rounded integer
result of the entire bill (mealCost with added tax and tip).

Sample Input

12.00
20
8
Sample Output

15
Explanation

Given:

mealCost = 12, tipPercent = 20, taxPercent = 8

Calculations:
tip = 12 x (20/100) = 2.4
tax = 12 x (8/100) = 0.96
totalCost = mealCost + tip + tax = 12 + 2.4 + 0.96 = 15.36
round(totalCost) = 15

We round totalCost to the nearest dollar (integer) and then print our result, 15.

*/

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SolutionDay2.solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

class SolutionDay2 {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double totalCost = meal_cost + tip + tax;
        long roundedCost = Math.round(totalCost);
        System.out.println(roundedCost);

    }
}

/*

OPERATORS
These allow you to perform certain operations on your data.
There are 3 basic types:

Unary: operates on 1 operand
Binary: operates on 2 operands
Ternary: operates on 3 operands

ARITHMETIC OPERATORS
The binary operators used for arithmetic are as follows:

+: Additive
-: Subtraction
*: Multiplication
/: Division
%: Remainder (modulo)

ADDITIONAL OPERATORS

+:  A binary operator used for String concatenation

++: This unary operator is used to pre-increment (increment by 1 before use)
    when prepended to a variable name or post-increment (increment by 1 after use)
    when appended to a variable.

--: This unary operator is used to pre-decrement (decrement by 1 before use) when prepended
    to a variable name or post-decrement (decrement by 1 after use) when appended to a variable.

!:  This unary operator means not (negation).
    It's used before a variable or logical expression that evaluates to true or false.

==: This binary operator is used to check the equality of 2 primitives.

!=: This binary operator is used to check the inequality of 2 primitives.

<, >, <=, >=:   These are the respective binary operators for less than, greater than, less
                than or equal to, and greater than or equal to, and are used to compare two operands.

&&, ||:     These are the respective binary operators used to perform logical AND and logical OR operations
            on two boolean (i.e.: true or false) statements.

? :         This ternary operator is used for simple conditional statements (i.e.: if ? then : else).

variables:
1. declare
2. allocate
3. initialize

instance methods and properties

constructors
1. default
2. custom

initializing an instance of a car


*/