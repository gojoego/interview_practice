package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today, we're working with binary numbers.

Task
Given a base-10 integer, n, convert it to binary (base-2).
Then find and print the base-10 integer denoting the maximum
number of consecutive 1's in n's binary representation.

Input Format

A single integer, n.

Constraints     1 <= n <= 10^6

Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

Sample Input 1: 5
Sample Output 1: 1

Sample Input 2: 13
Sample Output 2: 2

Explanation

Sample Case 1:
The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2:
The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.

*/

import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

    }

}

/*

RADIX (BASE)
The number of digits that can be used to represent a number in a positional number system.
The decimal number system (base-10) has  digits (0,1,2,3,4,5,6,7,8,9);
the binary (base-2) number system has 2 digits (0,1).

We think in terms of base-10, because the decimal number system is the only one many people need in everyday life.
For situations where there is a need to specify a number's radix, number n having radix r should be written as (n)r.

BINARY TO DECIMAL CONVERSION
In the same way that (840)10 = (8x10^2)+(4x10^1)+(0x10^0) = 800+40+0 = 840,
a binary number having k digits in the form of dk-1dk-2...d2d1d0 can be converted to
decimal by summing the result for each di x 2^i where 0 <= i <= k-1, i=k-1 is the most significant bit,
and i=0 is the least significant bit.

For example: (1011)2 -> (?)10 is evaluated as (1x2^3)+(0x2^2)+(1x2^0)+(1x2^0) = 8 _l_ 0 _l_ 2 _l_ 1 = (11)10

DECIMAL TO BINARY CONVERSION
To convert an integer from decimal to binary, repeatedly divide your base-10 number, n, by 2.
The dividend at each step i should be the result of the integer division at each step i-1.
The remainder at each step of division is a single digit of the binary equivalent of n;
if you then read each remainder in order from the last remainder to the first (demonstrated below),
you have the entire binary number.

For example: (4)10 -> (?)2. After performing the steps outlined in the above paragraph,
the remainders form (100)2 (the binary equivalent of (4)10) when read from the bottom up:
                    ^
4/2 = 2 remainder 0 |
                    ^
2/2 = 1 remainder 0 |
                    ^
1/2 = 0 remainder 1 |

This can be expressed in pseudo-code as:

while(n > 0):
    remainder = n%2;
    n = n/2;
    Insert remainder to front of a list or push onto a stack

Print list or stack

Many languages have built-in functions for converting numbers from decimal to binary.
To convert an integer, N, from decimal to a String of binary numbers in Java,
you can use the Integer.toBinaryString(n) function.

Note: The algorithm discussed here is for converting integers;
converting fractional numbers is a similar (but different) process.

boolean
-true   1
-false  0

digits 0 to 9: base 10



*/























































