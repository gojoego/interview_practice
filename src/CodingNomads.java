
/*
        Coding Nomads Algorithm challenge:

        Write a function that takes one parameter “n”, and it prints all numbers between 1 and n
        -If n is a multiple of 3, instead of the number print “Coding”
        -If n is a multiple of 5, instead of the number print “Nomads”
        -If n is a multiple of both 3 and 5, print “Coding Nomads”
        -Otherwise, print the number
        Feel free to write this function in Java or JavaScript, whichever you prefer

        Sample Output:
        1, 2, Coding, 4, Nomads, Coding, 7, 8, Coding, Nomads, 11, Coding, 13, 14,
        Coding Nomads, 16, 17, Coding, 19, Nomads, Coding, 22, 23, Coding, Nomads, 26,
        Coding, 28, 29, Coding Nomads, 31, 32, Coding, 34, Nomads, Coding, ...
*/


public class CodingNomads {

    public static void main(String[] args) {

        printingNumbersAndWords(90);

    }

    static void printingNumbersAndWords(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( i + " Coding Nomads");
            } else if (i % 3 == 0) {
                System.out.println(i + " Coding");
            } else if (i % 5 == 0) {
                System.out.println(i + " Nomads");
            } else {
                System.out.println(i);
            }
        }
    }
}

// similar to Fizz Buzz question often asked during interviews
