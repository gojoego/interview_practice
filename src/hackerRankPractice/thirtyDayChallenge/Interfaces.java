package hackerRankPractice.thirtyDayChallenge;

/*

TASK

The AdvancedArithmetic interface and the method declaration
for the abstract divisorSum(n) method are provided for you in the editor below.

Complete the implementation of Calculator class, which implements the AdvancedArithmetic
interface. The implementation for the divisorSum(n) method must return the sum of all divisors of n.

Input Format: A single line containing an integer, n.

Constraints: 1 <= n <= 1000

Output Format:  You are not responsible for printing anything to stdout.
                The locked template code in the editor below will call your
                code and print the necessary output.

Sample Input:   6

Sample Output   I implemented: AdvancedArithmetic
                12

Explanation

The integer 6 is evenly divisible by 1, 2, 3, and 6.
Our divisorSum method should return the sum of these
numbers, which is 1+2+3+6=12. The Solution class then
prints "I implemented: AdvancedArithmetic" on the
first line, followed by the sum returned by divisorSum
(which is 12) on the second line.

*/

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic {
    // implementation for method must return sum of all divisors of n
    public int divisorSum(int n){
        int sum =0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum = sum + n;
            } else {
                break;
            }
        }
        return sum;
    }
}

public class Interfaces {

    public static void main(String[] args) {

        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);

        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);

        Polygon square = new Square(2);
        print(square);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }

    public static void print(Polygon p){
        System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
        System.out.println("The perimeter of this shape is: " +  p.getPerimeter() + '\n');
    }
}

/*

INTERFACE
Recall that abstraction is the separation between what something does and how it's accomplished.
An interface is a collection of abstract methods and constants that form a common set of base
rules/specifications for those classes that implement it. Much like an abstract class, an interface
cannot be instantiated and must be implemented by a class.

Example
Consider a polygon. How do we interact with polygons? What properties are common among polygons?
Take some time to review the simple Polygon interface below, as well as the classes that implement it.

*/

/**
 *   This is a collection of methods we expect and require a polygon to have
 **/

interface Polygon{
    /** @return The number of sides of the Polygon **/
    int getNumberOfSides();
    /** @return The perimeter of the Polygon **/
    double getPerimeter();
}

class Triangle implements Polygon {

    private static int numberOfSides = 3;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

class Rectangle implements Polygon {

    private static int numberOfSides = 4;
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public double getPerimeter(){
        return side1 + side1 + side2 + side2;
    }
}

/**
 *    This inherits the properties and methods of its superclass, Rectangle.
 **/

class Square extends Rectangle implements Polygon {
    public Square(double side){
        super(side, side);
    }
}

/*

When run, the Solution class produces the following output:

A Triangle has 3 sides.
The perimeter of this shape is: 6.0

A Rectangle has 4 sides.
The perimeter of this shape is: 10.0

A Square has 4 sides.
The perimeter of this shape is: 8.0

By having Rectangle, Square, and Triangle implement Polygon
(as opposed to having them be completely separate standalone classes),
we have a guarantee that all three classes (and any future classes that
implement Polygon) will follow the same basic rules. Knowing the rules
for what any class implementing Polygon will do enables us independently
write code that uses some type of Polygon, regardless of how it's implemented.

Another benefit is that if we decide to improve upon our Polygon interface
by adding a double getArea() method, our code will not compile unless we add
an implementation for getArea to each class that implements Polygon.

*/























