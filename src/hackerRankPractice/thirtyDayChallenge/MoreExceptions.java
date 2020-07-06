package hackerRankPractice.thirtyDayChallenge;

/*

Objective

Task
Write a Calculator class with a single method: int power(int,int).
The power method takes two integers, n and p, as parameters and
returns the integer result of n^p. If either n or p is negative,
then the method must throw an exception with the message: n and p should be non-negative.

Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

Input Format

Input from stdin is handled for you by the locked stub code in your editor.
The first line contains an integer, T, the number of test cases. Each of the
T subsequent lines describes a test case in 2 space-separated integers
denoting n and p, respectively.

Constraints: No Test Case will result in overflow for correctly written code.

Output Format

Output to stdout is handled for you by the locked stub code in your editor.
There are T lines of output, where each line contains the result of n^p as
calculated by your Calculator class' power method.

Sample Input

4
3 5
2 4
-1 -2
-1 3

Sample Output

243
16
n and p should be non-negative
n and p should be non-negative

Explanation

T = 4
T0: 3 and 5 are positive, so power returns the result of 3^5, which is 243.
T1: 2 and 4 are positive, so power returns the result of 2^4=, which is 16.
T2: Both inputs (-1 and -2) are negative, so power throws an exception and
 "n and p should be non-negative" is printed.
T3: One of the inputs (-1) is negative, so power throws an exception and
 "n and p should be non-negative" is printed.

*/

import java.util.Scanner;

// write Calculator class
class Calculator {

    // method power(int n, int p)
    // if negative: "n and p should be non-negative"
    public int power(int n, int p) {
        // if-else statement if negative number
        if (n < 0){
            throw new NumberFormatException("n and p should be non-negative");
        } else if (p < 0){
            throw new NumberFormatException("n and p should be non-negative");
        } else {
            return (int) Math.pow(n, p);
        }
    }
}

public class MoreExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n,p);
                System.out.println(ans);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

/*

PROPAGATING EXCEPTIONS
If an exception is not caught by the method that threw it,
the program's control is transferred back (propagated) to
the calling method (i.e.: whatever called the method that
threw the exception). This can be good if you have designed
your program to handle exceptions at a high level, but bad
if you never write code to catch the exception in the calling
methods that the exception is being propagated to. The example
method below throws an exception of type Exception, which
propagates back to the calling method (main), where a catch
block catches it and prints a message:

class PropagatedException {

    void example() throws Exception{
        throw new Exception("This exception will always be thrown.");
    }

    public static void main(String[] args) {
        PropagatedException p = new PropagatedException();
        try{
            p.example();
        }
        catch(Exception e){
            System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
        }
    }
}
The above code throws a java.lang.Exception and prints:

Exception: This exception will always be thrown.

*/