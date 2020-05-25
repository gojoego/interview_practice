package hackerRankPractice.thirtyDayChallenge;

/*

Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak
Explanation

Test Case 0:






The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().

Test Case 1:




The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().

*/


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LoopsAndStrings {

    public static void main(String[] args) {

        char myChar = 'c'; // create char c
        System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);
        // output is The ASCII value of c is: 99

    }




}

/*

As we've mentioned previously, a String is a sequence of characters. In the same way that words inside double quotes signify a String, a single letter inside single quotes signifies a character. Each character has an ASCII value associated with it, which is essentially a numeric identifier. The code below creates a char variable with the value , and then prints its ASCII value.

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