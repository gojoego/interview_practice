package hackerRankPractice.thirtyDayChallenge;

/*

TASK
Your local library needs your help! Given the expected and actual return dates for a library book,
create a program that calculates the fine (if any). The fee structure is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
2. If the book is returned after the expected return day but still within the same calendar month and year
    as the expected return date, fine = 15 Hackos x (the number of days late).
3. If the book is returned after the expected return month but still within the same calendar
    year as the expected return date, the fine = 500 Hackos x (the number of months late).
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.

Input Format

The first line contains 3 space-separated integers denoting the respective day, month, and year
on which the book was actually returned.

The second line contains 3 space-separated integers denoting the respective day, month, and year
on which the book was expected to be returned (due date).

Constraints

1 <= D <= 31
1 <= M <= 12
1 <= Y <= 3000

It is guaranteed that the dates will be valid Gregorian calendar dates.

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015

Sample Output

45

Given the following return dates:
Actual: Da = 9, Ma = 6, Ya = 2015
Expected: De = 6, Me = 6, Ye = 2015

Because Ye == Ya, we know it is less than a year late.
Because Me == Ma, we know it's less than a month late.
Because De < Da, we know that it was returned late (but still within the same month and year).

Per the library's fee structure, we know that our fine will be 15 Hackos x (# days late).
We then print the result of 15 x (Da - De) = 15 x (9 - 6) = 45 as our output.

*/

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // create Scanner object
        Scanner scanner = new Scanner(System.in);

        // first line: assign first input to the variable day_actual
        int actualDay = Integer.parseInt(scanner.next());

        // first line: assign second input to the variable month_actual
        int actualMonth = Integer.parseInt(scanner.next());

        // first line: assign third input to the variable year_actual
        int actualYear = Integer.parseInt(scanner.next());

        // line break for input
        scanner.nextLine();

        // second line: assign first input to the variable day_expected
        int expectedDay = Integer.parseInt(scanner.next());

        // second line: assign second input to the variable month_expected
        int expectedMonth = Integer.parseInt(scanner.next());

        // second line: assign third input to the variable year_expected
        int expectedYear = Integer.parseInt(scanner.next());

        // nested if-else statements

        // compare year variables: if actual is more than expected, return 10000 Hackos

        int yearFine = 10000;
        int monthFine = 500 * Math.abs(expectedMonth - actualMonth);
        int dayFine = 15 * Math.abs(expectedDay - actualDay);

        if (actualYear == expectedYear) {
            // compare month variables: if actual is more than expected, return a-e x 500 Hackos
            if (actualMonth == expectedMonth) {
                // compare day variables: if actual is more than expected, return a-e x 15 Hackos
                if (expectedDay < actualDay) {
                    System.out.println(dayFine);
                } else if (expectedDay > actualDay) {
                    System.out.println("0");
                }
            } else if (expectedMonth > actualMonth) {
                System.out.println("0");
            } else {
                System.out.println(monthFine);
            }
        } else if (expectedYear > actualYear) {
            System.out.println("0");
        } else {
            System.out.println(yearFine);
        }






    }

}

























