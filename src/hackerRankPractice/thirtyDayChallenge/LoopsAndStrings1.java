package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops.

Task
Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and
odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format    The first line contains an integer, T (the number of test cases).
                Each line i of the T subsequent lines contain a String, S.

Constraints     1 <= T <= 10
                2 <= length of S <= 10000

Output Format

For each String Sj (where 0 <= j <= T - 1), print Sj's even-indexed characters,
followed by a space, followed by Sj's odd-indexed characters.

Sample Input    2
                Hacker
                Rank

Sample Output   Hce akr
                Rn ak

Explanation

Test Case 0:

S = "Hacker"
S[0] = "H"
S[1] = "a"
S[2] = "c"
S[3] = "k"
S[4] = "e"
S[5] = "r"

The even indices are 0, 2, and 4, and the odd indices are 1, 3, and 5.
We then print a single line of 2 space-separated strings; the first string
contains the ordered characters from S's even indices (Hce), and the second string
contains the ordered characters from S's odd indices (akr).

Test Case 1:

S = "RANK"
S[0] = "R"
S[1] = "a"
S[2] = "n"
S[3] = "k"

The even indices are 0 and 2, and the odd indices are 1 and 3.
We then print a single line of 2 space-separated strings;
the first string contains the ordered characters from S's even indices (Rn),
and the second string contains the ordered characters from S's odd indices (ak).

*/

import java.util.Scanner;

public class LoopsAndStrings1 {

    public static void main(String[] args) {

        LoopsAndStrings1 loopsAndStrings1 = new LoopsAndStrings1();
        loopsAndStrings1.enterNumberOfCases();
        loopsAndStrings1.createIterateCharArray();

    }


    // scanner to take int for number of test cases
    Scanner scanner = new Scanner(System.in);
    int numberOfCases;
    String userInput;
    char index;

    public void enterNumberOfCases() {
        setNumberOfCases(scanner.nextInt());
    }

    public void enterUserInput() {
        setUserInput(scanner.nextLine());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }

    public void createIterateCharArray() {
        enterUserInput();
        char[] charArray = userInput.toCharArray();
        for (int i = 0; i <= userInput.length(); i++) {
            while (i % 2 == 0) {
                System.out.print(charArray[i]);
            }
            System.out.print(" ");
            System.out.println(charArray[i]);
        }
    }
//        // Printing array
//        for (char c : ch) {
//            System.out.println(c);
//            userInput        // Creating array and Storing the array
//            // returned by toCharArray()
//            char[] ch = str.toCharArray();
//          }


    // loop scanner to take in lines for each test case
    // while loop until number of cases
    // create char array of each letter
    // print even indices
    // space
    // print odd indices

    public void castingCharToInt() {
        char myChar = 'c'; // create char c
        System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);
        // output is The ASCII value of c is: 99
    }

    public int getNumberOfCases() {
        return numberOfCases;
    }

    public void setNumberOfCases(int numberOfCases) {
        this.numberOfCases = numberOfCases;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}

/*

As we've mentioned previously, a String is a sequence of characters.
In the same way that words inside double quotes signify a String,
a single letter inside single quotes signifies a character. Each character
has an ASCII value associated with it, which is essentially a numeric identifier.
The code below creates a char variable with the value , and then prints its ASCII value.

char myChar = 'c'; // create char c
System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);
Output:

The ASCII value of c is: 99

Observe the (int) before the variable name in the code above. This is called explicit casting, which is a method of representing one thing as another. Putting a data type inside parentheses right before a variable is essentially saying: "The next thing after this should be represented as this data type". Casting only works for certain types of relationships, such as between primitives or objects that inherit from another class.

To break a String down into its component characters, you can use the String.toCharArray method. For example, this code:

String myString = "This is String example.";
char[] myCharArray = myString.toCharArray();
for(int i = 0; i < myString.length(); i++){
    // Print each sequential character on the same line
    System.out.print(myCharArray[i]);
}
// Print a newline
System.out.println();
produces this output:

This is String example.
Notice that we were able to simulate printing myString by instead printing each individual character in the character array, myCharArray, created from myString.

*/