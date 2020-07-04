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
}

*/

public class ExceptionsPractice {

    public static void main(String[] args) {
        try{
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown " + e);
        }
        System.out.println("Finally Finished try-catch");
    }
}
