package hackerRankPractice.thirtyDayChallenge;
/*

Objective

The absolute difference between two integers, a and b, is written as |a-b|.
The maximum absolute difference between two integers in a set of positive integers, elements,
is the largest absolute difference between any two integers in elements.

The Difference class is started for you in the editor.
It has a private integer array (elements) for storing N non-negative integers, and a
public integer (maximumDifference) for storing the maximum absolute difference.

Task
Complete the Difference class by writing the following:
    - A class constructor that takes an array of integers as a parameter
    and saves it to the elements instance variable.
    - A computeDifference method that finds the maximum absolute difference between any 2 numbers
    in N and stores it in the maximumDifference instance variable.

Input Format

You are not responsible for reading any input from stdin.
The locked Solution class in your editor reads in 2 lines of input;
the first line contains N, and the second line describes the elements array.

Constraints     1 <= N <= 10
                1 <= elements[i] <= 100, where 0 <= i <= N - 1

Output Format

You are not responsible for printing any output;
the Solution class will print the value of the maximumDifference instance variable.

Sample Input

3
1 2 5

Sample Output

4

Explanation

The scope of the elements array and maximumDifference integer is the entire class instance.
The class constructor saves the argument passed to the constructor as the elements instance variable
(where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and
finds the maximum difference between any 2 elements: |1-2|=1
    |1-5|=4
    |2-5|=3

The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable.
The locked stub code in the editor then prints the value stored as maximumDifference, which is 4.

*/

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // add your code here


    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = 1;
        int min = 100;
        for (int element: elements){
            if (element < min){
                min = element;
            }
            if (element > max){
                max = element;
            }
        }
        this.maximumDifference = Math.abs(max-min);
    }
    // end of Difference class
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }

}

/*

SCOPE
This term refers to the region of the program to which an identifier applies.
While it is not good practice, you can declare multiple variables within a program
that use the same identifier as long as the identifiers have differing scopes;
some exceptions to this are:

    1.  A constructor or method parameter will often have the same
        name as a class field it's intended to initialize or modify.
    2.  It is customary to use i as the condition variable in a for-loop
        (and, in cases of nested for-loops, to use j as the condition variable for the inner loop).

Note: When dealing with a class variable (field),
it's always best to explicitly refer to it using the this keyword.
For example:

*/

class MyClass2{
    private int myInt;

    public MyClass2(int myInt){
    	this.myInt = myInt;
    }
}

/*

Even though there is a myInt field in the class,
the constructor has a completely different myInt parameter.
The field (this.myInt) is then assigned the value of the parameter,
so any argument passed as that parameter will initialize the myInt field in the class.

Still confused? Take some time to review the Scope class below and understand why variables
with the same name will be of different types (and produce different outputs) at various points in the program:

*/

class Scope1{
    boolean b = true; // b1 has scope of entire class
    int x = 88; // x1 has scope of entire class

    Scope1(){
        double d = 9.0;
        example(d);
        classVariable();
    }

    void example(double x){ // parameter x2 has scope of this method
        System.out.println("----- example(double x):\n"
                + 	"Initial value of Local Variable `x`: " + x + "\n");

        x = 4.4; // reassign value of local variable x2

        System.out.println("New value of Local Variable `x`: " + x + "\n");

        for(int b = 0; b < 4; b++){ // b2 has scope of this loop
            int i = b + 4; // begin scope of int i
            System.out.println(	"For Loop 1 in example(double x):\n"
                + 	"Local Variable `b` (local to loop): " + b + "\n"
                +	"Local Variable `i` (local to loop): " + i + "\n"
                + 	"Local Variable `x` (method parameter): " + x + "\n");
        } // end the scope of int b2; end scope of int i

        for(int b = 0; b < 4; b++){
            x = b;
            System.out.println(	"For Loop 2 in example(double x):\n"
                +	"Local Variable `b` (local to loop): " + b + "\n"
                +	"Local Variable `x` (method parameter): " + x + "\n");
        } // end of the scope of this version of int b

        System.out.println("Local Variable `x` after Loop 2: " + x + "\n");

    } // end scope of double x2

    void classVariable(){
        System.out.println(	"----- classVariable():\n"
                +	"Instance Variable `b`: " + b + "\n"
                + 	"Instance Variable `x`: " + x);
    }

    public static void main(String[] args){
        Scope s = new Scope();
    }
} // end of boolean b's scope; end of int x's scope

/*

which produces this output:

----- example(double x):
Initial value of Local Variable `x`: 9.0

New value of Local Variable `x`: 4.4

For Loop 1 in example(double x):
Local Variable `b` (local to loop): 0
Local Variable `i` (local to loop): 4
Local Variable `x` (method parameter): 4.4

For Loop 1 in example(double x):
Local Variable `b` (local to loop): 1
Local Variable `i` (local to loop): 5
Local Variable `x` (method parameter): 4.4

For Loop 1 in example(double x):
Local Variable `b` (local to loop): 2
Local Variable `i` (local to loop): 6
Local Variable `x` (method parameter): 4.4

For Loop 1 in example(double x):
Local Variable `b` (local to loop): 3
Local Variable `i` (local to loop): 7
Local Variable `x` (method parameter): 4.4

For Loop 2 in example(double x):
Local Variable `b` (local to loop): 0
Local Variable `x` (method parameter): 0.0

For Loop 2 in example(double x):
Local Variable `b` (local to loop): 1
Local Variable `x` (method parameter): 1.0

For Loop 2 in example(double x):
Local Variable `b` (local to loop): 2
Local Variable `x` (method parameter): 2.0

For Loop 2 in example(double x):
Local Variable `b` (local to loop): 3
Local Variable `x` (method parameter): 3.0

Local Variable `x` after Loop 2: 3.0

----- classVariable():
Instance Variable `b`: true
Instance Variable `x`: 88

*/