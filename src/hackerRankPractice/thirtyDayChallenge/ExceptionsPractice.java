package hackerRankPractice.thirtyDayChallenge;

/*

what is an exception?
-event that occurs during execution of program
-disrupts normal flow of program's instructions

an exception is thrown:
-something went wrong in your program
-your program errors and exits abnormally

Exceptions

method {
    error!! -> created error object -> runtime system
}

when error occurs within method:
-method itself will create error object
-hands off to runtime system
-object called Exception object
-Exception object contains all info about error including
    type and state of program when error occurred
-Exception object is how we get error messages in the console

exception object
1. error type
2. state of program
3. how we get error messages in console

"throwing an exception":
whole event of creating exception object and handing it to runtime system when error occurs

what is an exceptional event?
-problem that arises during execution of your program and disrupts your program
-as a result, program terminates and exits abnormally

how do we handle exceptional events?
1. checked exceptions
    -occurs at compile time (syntax)
    -do not allow your program to run
2. unchecked exceptions
    -occurs at time your program is executed (logic)
    -also called runtime exceptions
    -arise from logical errors in code

try-catch block:
try {
    do this until we get an exception
} catch (type_of_error e){
    do this if we get type_of_error in the try
} finally {
    do this no matter what
}

try-catch block are useful when...
-you are not sure if your output will throw an exception
-you want to safe-guard against bad inputs

* can have multiple catch blocks for certain try
* want something to execute no matter what: use finally clause

try-catch-finally block
-allows us to let program TRY to do something

*/

public class ExceptionsPractice {

    public static void main(String[] args) {
        try{
            int[] c = new int[5];
            // arrays initialized to be zero
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown " + e);
        }
        finally {
            System.out.println("Finally clause");
        }
//        System.out.println("Finally Finished try-catch")
    }
}
