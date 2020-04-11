
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

        printingNumbersAndWords(5);

    }

    static void printingNumbersAndWords(int n) {

        for (int i = 1; i < n; i++) {

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Coding Nomads");
            } else if (n % 3 == 0) {
                System.out.println("Coding");
            } else if (n % 5 == 0) {
                System.out.println("Nomads");
            } else {
                System.out.println(i);
            }
        }
    }
}





