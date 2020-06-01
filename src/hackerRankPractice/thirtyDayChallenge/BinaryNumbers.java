package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1:
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2:
The binary representation of  is , so the maximum number of consecutive 's is .

*/

public class BinaryNumbers {
}

/*

Radix (Base)
The number of digits that can be used to represent a number in a positional number system. The decimal number system (base-) has  digits (); the binary (base-) number system has  digits ().

We think in terms of base-, because the decimal number system is the only one many people need in everyday life. For situations where there is a need to specify a number's radix, number  having radix  should be written as .

Binary to Decimal Conversion
In the same way that , a binary number having  digits in the form of  can be converted to decimal by summing the result for each  where ,  is the most significant bit, and  is the least significant bit.

For example:  is evaluated as

Decimal to Binary Conversion
To convert an integer from decimal to binary, repeatedly divide your base- number, , by . The dividend at each step  should be the result of the integer division at each step . The remainder at each step of division is a single digit of the binary equivalent of ; if you then read each remainder in order from the last remainder to the first (demonstrated below), you have the entire binary number.

For example: . After performing the steps outlined in the above paragraph, the remainders form  (the binary equivalent of ) when read from the bottom up:




This can be expressed in pseudocode as:

while(n > 0):
    remainder = n%2;
    n = n/2;
    Insert remainder to front of a list or push onto a stack

Print list or stack
Many languages have built-in functions for converting numbers from decimal to binary. To convert an integer, , from decimal to a String of binary numbers in Java, you can use the Integer.toBinaryString(n) function.

Note: The algorithm discussed here is for converting integers; converting fractional numbers is a similar (but different) process.

*/