package hackerRankPractice.challenge;

/*

Objective
In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format

There are  lines of numeric input:
The first line has a double,  (the cost of the meal before tax and tip).
The second line has an integer,  (the percentage of  being added as tip).
The third line has an integer,  (the percentage of  being added as tax).

Output Format

Print the total meal cost, where  is the rounded integer result of the entire bill ( with added tax and tip).

Sample Input

12.00
20
8
Sample Output

15
Explanation

Given:
, ,

Calculations:




We round  to the nearest dollar (integer) and then print our result, .

*/

public class Operators {
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


Additional Operators

+: A binary operator used for String concatenation
++: This unary operator is used to preincrement (increment by 1 before use) when prepended to a variable name or postincrement (increment by 1 after use) when appended to a variable.
--: This unary operator is used to predecrement (decrement by 1 before use) when prepended to a variable name or postdecrement (decrement by 1 after use) when appended to a variable.
!: This unary operator means not (negation). It's used before a variable or logical expression that evaluates to true or false.
==: This binary operator is used to check the equality of 2 primitives.
!=: This binary operator is used to check the inequality of 2 primitives.
<, >, <=, >=: These are the respective binary operators for less than, greater than, less than or equal to, and greater than or equal to, and are used to compare two operands.
&&, ||: These are the respective binary operators used to perform logical AND and logical OR operations on two boolean (i.e.: true or false) statements.
? : This ternary operator is used for simple conditional statements (i.e.: if ? then : else).

*/