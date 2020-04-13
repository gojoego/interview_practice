//  Fizz Buzz Implementation
//
//  Fizz Buzz is a very simple programming task, asked in software developer job interviews.
//
//  A typical round of Fizz Buzz can be:
//  Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz"
//  instead of the number and for the multiples of '5' print "Buzz".
//
//  1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,
//  Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
//  Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

// Java program to print Fizz Buzz
public class FizzBuzz {

    public static void main(String[] args) {

        int n = 100;

        // loop for 100 times
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.print("FizzBuzz" + " ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i % 5 == 0)
                System.out.print("Buzz" + " ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i % 3 == 0)
                System.out.print("Fizz" + " ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers
                System.out.print(i + " ");
        }
    }
}


