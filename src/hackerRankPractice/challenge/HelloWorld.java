package hackerRankPractice.challenge;


import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Solution.helloWorld();

        MyClass.myClass();

    }
}

class Solution {
    public static void helloWorld() {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.

        System.out.println(inputString);

    }

}

/*

CLASS

At its most basic level, a class is a collection of variables (fields) and functions called methods.
A program is a collection of classes. The basic code for declaring a Java class is as follows:

 */

class MyClass {

    DataType myVariable;

    public static void myClass(){}

    // This is a single-line comment.

    /*  This is also a comment.
        This type of comment can span several lines
    */
}

class DataType{}

/*

When declaring a class, the name should always start with a capital letter;
this signifies to certain compilers (and human readers of your code) that it is a class
(or other similarly-behaved structure that you'll learn about later). If you wish to use
a compound phrase (e.g.: "my class") as your class name, you should write it in CamelCase;
this means you should capitalize each word and remove spaces between words (e.g.: "MyClass").

Note: Class names cannot begin with numbers or contain any spaces.

VARIABLE

Think of this as a name (identifier) that points to (references) a location in memory
where information associated with that name can be stored. In Java (and many other languages),
it is a best practice to always start variable names with a lowercase letter and use CamelCase
for variable names composed from compound phrases. Variable names cannot contain spaces or
special characters (except underscores), though they can contain (but not begin with) numbers.
A variable that is a member of a class is called a field.

Each variable has a data type associated with it, which essentially restricts what that variable
is allowed to reference. This means your code will not work if you attempt to perform operations
on your variables that aren't allowed for that data type. To declare a variable named myVariable
having the data type DataType, we write the following:

DataType myVariable;

If we want to declare a variable of type DataType named myVar1 and initialize it to be value
(here, we are using the word value as a stand-in for a valid value of type DataType), we write:

DataType myVar1 = value;

In English, the above code is basically saying: "I'm creating a variable named myVar1;
it refers to something of type DataType, and is assigned an initial value of value."

Note: The = operator is called the assignment operator, so you should interpret = as the
English phrase "[left operand] is assigned the value of [right operand]".

A String is a data type that holds a sequence of characters. To create a String variable named myString
that stores the value "Hi!", write the following line of code:

String myString = "Hi!";

Note: Some coders use lowercase letters in conjunction with underscores to simulate spaces when
declaring variables (e.g.: "my_variable"). This is a style called "lower snake case" and is not
the naming convention used in Java, though there are many other languages where you might see this
used frequently (e.g.: C, C++, Python, etc.); however, you may see some Java coders begin certain
special variable names (e.g.: private class variables or constants) with an underscore to distinguish
them from other variables used throughout their program.

 */
























