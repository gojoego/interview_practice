package hackerRankPractice.thirtyDayChallenge;

/*

CHALLENGE

TASK
-Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
-Note: You must use the String-to-Integer and exception handling constructs built into your submission language.
    If you attempt to use loops/conditional statements, you will get a 0 score.

Input Format: A single string, S.

Constraints:    1 <= |S| <= 6, where S is the length of string S.
                S is composed of either lowercase letters (a-z) or decimal digits (0-9).

Output Format:  Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.

Sample Input 0:     3
Sample Output 0:    3

Sample Input 1:     za
Sample Output 1:    Bad String

Explanation

Sample Case 0 contains an integer, so it should not raise an exception
when we attempt to convert it to an integer. Thus, we print the 3.
Sample Case 1 does not contain any integers, so an attempt to convert
it to an integer will raise an exception. Thus, our exception handler prints Bad String.

*/

import java.util.LinkedList;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        // try
        // convert String to integer using Integer.parseInt(token)
        try{
            System.out.println(Integer.parseInt(s));
        }
        // catch
        // print "Bad String"
        catch (NumberFormatException n){
            System.out.println("Bad String");
        }
    }
}

/*

STRING TO INTEGER

Many languages offer some functionality for parsing an integer value from a string token.

Each of these functions will raise an error (i.e.: throw an exception) when the argument
passed as the token parameter cannot be converted to an integer. Most languages have built-in
exception handling methods such as try-catch or begin-rescue that enable you to code
specific behaviors to handle execution issues.

EXCEPTIONS

If your code attempts to perform an action that cannot be completed,
the flow of control is halted and an exception is thrown. This means
that an Exception object is created as a response to this unusual condition.
The control flow is then transferred (or handed off) to an exception handler.
By anticipating and writing handlers for exceptional conditions in your
program's logic, you can resolve the issue that raised the exception and
your program can continue executing. A program "crash" is generally the
result of an unhandled exception.

Exception handling is expensive, meaning it takes a lot of behind-the-scenes work for your
program to stop everything and figure out how an exceptional scenario should be handled.
Under normal circumstances, you can avoid the need to handle many kinds of exceptions by
anticipating and coding for all possible scenarios.

MANAGING EXCEPTIONS: TRY

The try block is like a staging area for potentially error-raising code.
If your program is unable to execute the code inside a try block,
it throws an exception and tries to find an exception handler to salvage
the situation. The syntax is as follows:

try{
    // write exception-throwing code here
}

MANAGING EXCEPTIONS: CATCH

A catch block should always immediately follow a try block,
and looks like a sort of mini-function. It must take some type
of exception (either Exception or one of its subclasses)
as a parameter, and it looks like this:

catch(Exception e){
    // write exception handling logic here
}

Part of writing good code is knowing, circumventing, and anticipating
exactly what type of exceptions your instructions might throw, but if
your parameter is of type Exception, it will catch any exception that
is a subclass of Exception. If the code in your try block has the potential
to throw more than one type of exception, you can have multiple catch blocks
to catch each type of anticipated exception.

MANAGING EXCEPTIONS: FINALLY

The finally block immediately follows the catch block, and will always execute
when the try block exits—regardless of whether or not an exception is thrown.
The finally block is optional, and generally used for cleanup code.

MANAGING EXCEPTIONS: TRY WITH RESOURCES

This is useful when you are using a resource that must be opened/closed (anything that
implements java.lang.AutoCloseable or java.io.Closeable), such as a Scanner or BufferedReader.
While you will likely never need try-with-resources blocks for our challenges,
it's still worth knowing about.

try(Scanner scan = new Scanner();){
    // use scanner to do something that potentially throws an exception
}

*/

class ExceptionExample {
    LinkedList<String> list;
    int[] intArray = new int[4];

    // for testing Null Pointer Exception
    ExceptionExample() {
        this.list = null;
    }

    // for testing Index Out of Bounds
    ExceptionExample(String str) {
        this.list = new LinkedList<String>();
        list.add(str);
    }

    void exceptionDemo(int i, String str) {
        try {
            // throws ArrayIndexOutOfBoundsException if index > intArray.length
            int myInt = intArray[i];

            // throws a NullPointerException if 'list' doesn't point to an actual list object
            list.indexOf(str);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("The following index is out-of-bounds: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.err.println("Oh no! You tried to perform an operation on an object whose value is null!");
        }
        finally {
            System.out.println("This is printing regardless of whether or not the program finishes executing.");
        }
        System.out.println("The program was able to continue execution!\n");
    }

//    public static void main(String[] args) {
//        // creates a Solution object whose 'list' instance variable points to null:
//        ExceptionExample sNullList = new ExceptionExample();
//        // attempt to access an element of the null list, throws Exception
//        sNullList.exceptionDemo(1, "x");
//
//        // creates a Solution object whose 'list' instance variable points to a list containing 1 element ("x"):
//        ExceptionExample sNotNullList = new ExceptionExample("x");
//        // attempt to access an invalid index of 'intArray' instance variable, throws Exception
//        sNotNullList.exceptionDemo(100, "x");
//    }
}

/*

Output:

Oh no! You tried to perform an operation on an object whose value is null!
This is printing regardless of whether or not the program finishes executing.
The program was able to continue execution!

The following index is out-of-bounds: 100
This is printing regardless of whether or not the program finishes executing.
The program was able to continue execution!

*/




















































