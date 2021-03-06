package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today, we're discussing data types.

Task:
Complete the code in the editor below. The variables i, d, and s are already declared and
initialized for you. You must:

    Declare 3 variables: one of type int, one of type double, and one of type String.
    Read 3 lines of input from stdin (according to the sequence given in the Input Format section below)
        and initialize your  variables.
    Use the  operator to perform the following operations:
        Print the sum of  plus your int variable on a new line.
        Print the sum of  plus your double variable to a scale of one decimal place on a new line.
        Concatenate  with the string you read as input and print the result on a new line.

Note: If you are using a language that doesn't support using + for string concatenation (e.g.: C),
you can just print one variable immediately following the other on the same line. The string provided
in your editor must be printed first, immediately followed by the string you read as input.

Input Format

The first line contains an integer that you must sum with .
The second line contains a double that you must sum with .
The third line contains a string that you must concatenate with .

Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

Sample Input

12
4.0
is the best place to learn and practice coding!
Sample Output

16
8.0
HackerRank is the best place to learn and practice coding!
Explanation

When we sum the integers  and , we get the integer .
When we sum the floating-point numbers  and , we get .
When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.

You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.

*/

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

//        SolutionDay1.addingVariables();


//        Car familyCar = new Car();
//        familyCar.printVariables();
//        Car aliceCar = familyCar;
//        familyCar.wreckCar();
//        familyCar.upgradeMinSpeed();
//
//        System.out.println("Alice's Car");
//        aliceCar.printVariables();

        // the value 10 is an argument
        // argument: a piece of data passed into a function whose value becomes the value of the parameter
        // f(x) = x + 1;
        // say x = 5;
        // f(5) = 5 + 1 = 6
//        Car birthdayPresent = new Car(500, 5000.545, true);
//        System.out.println("Birthday Car v1");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTilOutOfGas());
//        System.out.println("Max Miles: " + birthdayPresent.maxMilePerFillUp());
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//        System.out.println("Birthday Car v3");
//        birthdayPresent.printVariables();

        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();




//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();

    }


}

class SolutionDay1 {

    public static void addingVariables() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        int secondInt;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();
        secondString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */

        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */

        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        System.out.println(s + secondString);

        scan.close();
    }
}

/*

creating variables

1. declare (typing out name of variable)
2. allocate (make space for variable, type)
3. initialize (assigning a value)

*/


class Car {

    // instance variables
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    // notice the use of camelCase

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";


    double maxFuel = 16;
    double currentFuel = 8; // declaring and allocating and initializing
    double mpg = 26.4; // declaring variable mpg, allocating space for double, giving it a value and initializing

    int numberOfPeopleInCar = 1; // int because you can't hav 1.5 people in a car
    int maxNumberOfPeopleInCar = 6;

    // custom car vs. default car
    // custom car - custom initializer - set custom values to properties
    // default car - default initializer - set default values to properties
    // use constructor as custom initializer

    // parameter: a variable in a function that refers to input data
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    public Car(){

    }

    // getters and setters for cleaner code

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // function scope: public, protected or private
    // parameter: a variable in a function that refers to input data
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }

    public void setTheCarOn(boolean theCarOn) {
        isTheCarOn = theCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getNumberOfPeopleInCar() {
        return numberOfPeopleInCar;
    }

    public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
        this.numberOfPeopleInCar = numberOfPeopleInCar;
    }

    public int getMaxNumberOfPeopleInCar() {
        return maxNumberOfPeopleInCar;
    }

    public void setMaxNumberOfPeopleInCar(int maxNumberOfPeopleInCar) {
        this.maxNumberOfPeopleInCar = maxNumberOfPeopleInCar;
    }

    public void printVariables() {
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println("This is the minSpeed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("Is the car on or off? " + isTheCarOn);
        System.out.println("This is the condition: " + condition);
        System.out.println("This is the name of the car: " + nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void wreckCar() {
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        //numberOfPeopleInCar = numberOfPeopleInCar + 1;
        // if there aren't too many people in the car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            // then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            // otherwise print out the fact that the car is full
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        //numberOfPeopleInCar = numberOfPeopleInCar - 1;
        // if there's people in the car
        if (this.numberOfPeopleInCar > 0) {
            // then tell one to get out
            numberOfPeopleInCar--;
        } else {
            // otherwise not one can get out and we'll print that
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }
    // can have the "if" without the "else" but cannot have the "else" without the "if"

    public double howManyMilesTilOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilePerFillUp() {
        return maxFuel * mpg;
    }
    // separating code into functions allows tracking and method saving

    public void turnTheCarOn() {
        // if the car isn't on...
        if (!isTheCarOn) {
            // turn it on
            isTheCarOn = true;
        } else{
            // otherwise print out the fact that it's on already
            System.out.println("The Car is already on " + isTheCarOn);
        }
    }
    /*

    if statement:
    -if the car is already on, do nothing
    -if the car is not on, set isTheCarOn to true

    if statement:
    -if (condition){do this}

    */

}


/*

DATA TYPES

Data types define and restrict what type values can be stored in a variable, as well as set the rules
for what types of operations can be performed on it.

PRIMITIVE DATA TYPES
aka value types

Java has 8 primitive data types: byte, short, int, long, float, double, boolean, and char.
For most challenges, you'll only need to concern yourselves with ints (e.g.: 1, 2, 3, etc.) and
doubles (e.g.: 1.0, 2.5, 3.9, etc.). Another important data type we mentioned yesterday is the
String class, whose objects are immutable strings of characters.

REFERENCE TYPE

Shared copy

examples: Arrays, Queues, Linked Lists, Stacks

SCANNER

Yesterday, we discussed Scanner's next, nextLine, hasNext, and hasNextLine methods.
Scanner also has readNext and hasNext methods for different data types, which is very helpful
when you know exactly what type of input you'll be reading. The next methods scan for tokens
(you can think of this as a word), and the nextLine methods reads from the Scanner's current
location until the beginning of the next line. For example, nextInt() will scan the next token
of input as an int, and nextDouble() will scan the next token of input as a double. You should
only ever use 1 scanner object for your entire program.

Each line of multi-line input contains an invisible separator indicating that the end of a line
of input has been reached. When you use Scanner functions that read tokens
(e.g.: next(), nextInt(), etc.), the Scanner reads and returns the next token. When you read
an entire line (i.e.: readLine()), it reads from the current position until the beginning of
the next line. Because of this, a call to nextLine() may return an empty string if there are no
characters between the end of the last read and the beginning of the next line. For example,
given the following input:

a b c
d e
f
g

The breakdown below shows how a certain sequence of calls to a Scanner object, scan,
will read the above input:

A call to scan.next(); returns the next token, a.
A call to scan.next(); returns the next token, b.

A call to scan.nextLine(); returns the next token, c. It's important to note that the
scanner returns a space and a letter, because it's reading from the end of the last token
until the beginning of the next line.

A call to scan.nextLine(); returns the contents of the next line, d e.

A call to scan.next(); returns the next token, f.

A call to scan.nextLine(); returns everything after f until the beginning of the next line;
because there are no characters there, it returns an empty String.

A call to scan.nextLine(); returns g.

Note: You will struggle with this challenge if you did not review this section.
You must understand what happens when you switch between reading a token (single word) of
input and reading an entire line of input to successfully complete this challenge.

ADDITIVE OPERATOR

The + operator is used for mathematical addition and String concatenation
(i.e.: combining two Strings into one new String). If you add the contents of two variables
together (e.g.: a + b), you can assign their result to another variable using the assignment
operator (=). You can also pass the result to a function instead of assigning it to a variable;
for example, if a = 1 and b = 2, System.out.println(a + b); will print 3 on a new line.

*/













