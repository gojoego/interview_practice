/*

Question 1

Write a program to print numbers from 1 to 10.

Question 2

Write a program to calculate the sum of first 10 natural numbers.

Question 3

Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

Question 4

Write a program to find the factorial value of any number entered through the keyboard.

Question 5

Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

*/

import java.util.Scanner;

public class LoopPractice1 {

    public static void main(String[] args) {

        // function to print 1 to 10
        System.out.print("numbers 1 to 10: ");
        printOneToTen();

        System.out.println();

        // function to add first ten natural numbers
        int x = sumFirstTenNaturalNumbers();
        System.out.println("The sum of the first ten natural numbers is: " + x);

        multiplicationTable1();

        multiplicationTable2();

        factorial();

    }

    public static void printOneToTen() {

        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
    }

    // natural numbers: positive whole numbers (1,2,3...)
    // will need a loop that adds like this: 1 + 2 + 3 ...
    // first loop: 1 + 2 = 3
    // second loop: 3 + 4 = 7
    // third loop: 7 + 5 = 12
    public static int sumFirstTenNaturalNumbers() {

        int sum = 0;
        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
        }
        return sum;
    }

    public static void multiplicationTable1() {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a positive number:");

        // assign input from scanner as int variable
        int number = scanner.nextInt();

        // outer loop
        for (int a = 1; a <= number; a++) {

            // inner loop
            for (int b = 1; b <= number; b++) {
                System.out.print(a * b + " |");
            }
            System.out.println();
        }
    }

    public static void multiplicationTable2(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter any positive integer: ");

        int num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

    }

    public static void factorial(){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int input = console.nextInt();
        int factorial = 1;

        for (int i = 1; i <= input; i++){
            factorial *= i;
        }

        System.out.println("The factorial of " + input + " is " + factorial + ".");

    }

}



