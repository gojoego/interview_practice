package hackerRankPractice.thirtyDayChallenge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*

Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
Completed code for Person and a declaration for Student are provided for you in the editor.
Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has 4 parameters:
    1. A string, firstName.
    2. A string, lastName.
    3. An integer, id.
    4. An integer array (or vector) of test scores, scores.

A char calculate() method that calculates a Student object's average and
returns the grade character representative of their calculated average:

Grading Scale:

    Letter  Average (a)
    O       90 <= a <= 100
    E       80 <= a < 90
    A       70 <= a < 80
    P       55 <= a < 70
    D       40 <= a < 55
    T       a < 40

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments.
It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains firstName, lastName, and id, respectively.
The second line contains the number of test scores. The third line of space-separated integers describes scores.

Constraints     1 <= |firstName|,|lastName| <= 10
                |id| == 7
                0 <= score,average <= 100

Output Format

This is handled by the locked stub code in your editor.
Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input    Heraldo Memelli 8135627
                2
                100 80

Sample Output   Name: Memelli, Heraldo
                ID: 8135627
                Grade: O

Explanation

This student had 2 scores to average: 100 and 80. The student's average grade is (100+80)/2 = 90.
An average grade of 90 corresponds to the letter grade O, so our calculate() method should return the character'O'.

*/

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        int average = 0;
        // add scores together
        for (int i = 0; i < testScores.length; i++) {
            average = average + testScores[i];
        }
        average = average / testScores.length;
        if (average >= 90) {
            return "O"; // outstanding
        } else if (average >= 80) {
            return "E"; // excellent
        } else if (average >= 70) {
            return "A"; // average
        } else if (average >= 55) {
            return "P"; // poor
        } else if (average >= 40) {
            return "D"; // damn
        } else {
            return "T"; // tough
        }
    }
}


public class Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

/*

INHERITANCE
This allows you to establish a hierarchy for your classes.
A class that inherits from some other class (referred to as a superclass) is called a subclass.
While a subclass inherits methods and behaviors from a superclass,
it can also declare new fields and methods (as well as override superclass methods).

SUBCLASS
A subclass is defined with the extends keyword.
For example, the syntax ClassB extends ClassA establishes ClassB as a subclass of of ClassA.
Java only supports single inheritance, meaning a subclass cannot extend more than one superclass.

Synonymous terms: derived class, extended class, child class.

SUBCLASS CONSTRUCTORS
Because a constructor initializes an instance of a class, they are never inherited;
however, the subclass must call a superclass constructor as it is an extension of a superclass object.
This can be done in either of the two ways shown below.

Consider the following class:

*/

    class MySuperclass {
        // superclass instance variable:
        String myString;

        // superclass default (empty) constructor:
        MySuperclass() {
        }

        // superclass parameterized constructor:
        MySuperclass(String myString) {
            // initialize instance variable
            this.myString = myString;
        }
    }

/*

1) The subclass makes an explicit call to the superclass' parameterized constructor
    (i.e.: it calls super(...);):

*/

    class MySubclass1 extends MySuperclass {
        // subclass constructor:
        MySubclass1(String myString) {
            // explicit call to superclass constructor:
            super(myString);
        }
    }

/*

2) The subclass makes an implicit call to the superclass' default constructor
(i.e.: a behind-the-scenes call to super(); happens automatically):

*/

    class MySubclass2 extends MySuperclass {
        MySubclass2(String myString) {
            // behind-the-scenes implicit call to superclass' default constructor happens

            // subclass can now initialize superclass instance variable:
            this.myString = myString;
        }
    }

/*

In the second example above, observe that we are initializing a field (myString)
that isn't even declared in that class; the reason why this works is because it's inherited from
MySuperclass and therefore can be accessed with the this keyword.

Note: If a superclass does not have a default constructor,
any subclasses extending it must make an explicit call to one of the superclass' parameterized constructors.

OVERRIDING METHODS
When overriding a method, it is best practice to precede the method with the @Override annotation.
This signifies to both the reader and the compiler that this method is overriding an inherited method,
and will also help you check your work by generating a compiler error if no such method exists in the superclass.
Method overriding is demonstrated in the example below.

Example
Let's say a not-for-profit organization has an Employee class,
and each instance of the Employee class contains the name and salary for an employee.
Then they decide that they need a similar-yet-different way to store information about volunteers,
so they decide to write a Volunteer class that inherits from Employee.
This is beneficial because any fields and methods added to Employee will also be accessible to Volunteer.

Take some time to review the code below. Observe that the Volunteer class calls the superclass' getName method,
but overrides its print method.

 */

    class Employee {
        // instance variables:
        protected String name;
        private int salary;

        /**
         * Parameterized Constructor
         *
         * @param name The volunteer's name.
         **/
        Employee(String name) {
            // use name param to initialize instance variable:
            this.name = name;
        }

        /**
         * @return The name instance variable.
         **/
        String getName() {
            return name;
        }

        /**
         * @param salary The integer to set as the salary instance variable.
         **/
        void setSalary(int salary) {
            this.salary = salary;
        }

        /**
         * @return The salary instance variable.
         **/
        int getSalary() {
            return salary;
        }

        /**
         * Print information about an instance of Employee.
         **/
        void print() {
            if (this.salary == 0) {
                System.err.println("Error: No salary set for " + this.name
                        + "; please set salary and try again.\n");
            } else { // Print employee information
                // Formatter for salary that will add commas between zeroes:
                NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);

                System.out.println("Employee Name: " + this.name
                        + "\nSalary: " + salaryFormat.format(this.salary) + "\n");
            }
        }
    }

    class Volunteer extends Employee {
        // instance variable:
        int hours;

        /**
         * Parameterized Constructor
         *
         * @param name The volunteer's name.
         **/
        Volunteer(String name) {
            // explicit call to superclass' parameterized constructor
            super(name);
        }

        /**
         * @param hours instance variable.
         **/
        void setHours(int hours) {
            this.hours = hours;
        }

        /**
         * @return The hours instance variable
         **/
        int getHours() {
            return hours;
        }

        @Override
        /** Overrides the superclass' print method and prints information about an instance of Volunteer. **/
        void print() {
            System.out.println("Volunteer Name: " + this.getName()
                    + "\nHours: " + this.getHours());
        }
    }

/*
    The following code:

    Employee employee = new Employee("Erica");
        employee.print();
        employee.setSalary(60000);
        employee.print();

    Volunteer volunteer = new Volunteer("Anna");
        volunteer.setHours(20);
        volunteer.print();
    produces this output:

    Error: No salary set for Erica; please set salary and try again.

    Employee Name:Erica
    Salary:60,000

    Volunteer Name:Anna
    Hours:20
*/


}