package hackerRankPractice.thirtyDayChallenge;

/*

Task
Consider a database table, Emails, which has the attributes First Name and Email ID.
Given N rows of data simulating the Emails table, print an alphabetically-ordered list
of people whose email address ends in @gmail.com.

Input Format

The first line contains an integer, N, total number of rows in the table.
Each of the N subsequent lines contains 2 space-separated strings denoting a
person's first name and email ID, respectively.

Constraints

2 <= N <= 30
Each of the first names consists of lower case letters [a-z] only.
Each of the email IDs consists of lower case letters [a-z], @ and . only.
The length of the first name is no longer than 20.
The length of the email ID is no longer than 50.

Output Format

Print an alphabetically-ordered list of first names for every user with a gmail account.
Each name must be printed on a new line.

Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output

julia
julia
riya
samantha
tanya

*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExPatternsDatabases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> listOfEmails = new ArrayList();
        for (int i = 0; i < numberOfEntries; i++){
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                listOfEmails.add(name);
            }
        }
        Collections.sort(listOfEmails);
        for (String name: listOfEmails){
            System.out.println(name);
        }
    }


//    // creating a Scanner object
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        // assigning int input to N
//        int N = scanner.nextInt();
//        // skips to next line
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] alphabetizeMe = new String[N];
//        // for loop to create array for every input
//        for (int NItr = 0; NItr < N; NItr++) {
//            // creating String array of the first name and email ID
//            String[] firstNameEmailID = scanner.nextLine().split(" ");
//
//            // setting first index of String array to String variable called firstName
//            String firstName = firstNameEmailID[0];
//
//            // setting second index of String array to String variable called emailID
//            String emailID = firstNameEmailID[1];
//
//            String emailDelimiter = "@";
//
//            String[] emailArray = emailID.split(emailDelimiter);
//            String emailDomain = emailArray[1];
//
//            System.out.println(emailDomain);
//
//
//            // declare String sequence of 1 or more uppercase and lowercase English
//            // letters including spaces
//            String inputString = "[a-zA-Z\\s]+";
//
//            // declare string we will check to see if our regex matches
//            String gmailDomainChecker = "gmail.com";
//            System.out.println(gmailDomainChecker);
//
//            if (emailDomain == gmailDomainChecker){
//                alphabetizeMe[N] = firstNameEmailID[0];
//            }
//
//            // create a Pattern object or compiled RegEx and save it as pattern
//            Pattern pattern = Pattern.compile(inputString);
//
//            // create a Matcher object to match compiled RegEx to String
//            Matcher matchingDomain = pattern.matcher(gmailDomainChecker);
//
////            if (matchingDomain.find()){
////                alphabetizeMe[N] = firstName;
////            }
//
//            // take email addresses and match to gmail.com
//            // take second index String and regex match at the @
//            // if statement if it matches @gmail.com print out the name
//            // adding to array that is declared outside of method so we can sort
//
//            // if statement to add first index to alphabetizeMe array if conditions meet
//
//
//        }
//        // print out alphabetical list
//        for (String a: alphabetizeMe){
//            System.out.println(a);
//        }
//
//        // alphabetize list of names with emails ending in gmails (sorting algo?)
//        scanner.close();
//    }
}

/*

Regular Expressions or RegEx
-means of describing a set of strings using a subset of common characteristics
-example: common characteristics of aaa, aba, aca are that they start and end with "a"
-regular expressions add level of abstraction to strings that makes it easier to search and manipulate text
-syntax standard across different programming languages

Character Classes
-not traditional class
-refers to set of one or more characters that can be used to match a single character from some input string
-basic forms:
    *   enclosed within square brackets
        specify what you would like your expression to match within square brackets
        for example: [a-f] will match any lowercase a through f character
    *   predefined: \ followed by a letter
        example: \d for matching digits (0-9) or \D for matching non-digits
        also additional predefined character classes that are followed by curly braces,
            such as \p{Punct} which matches punctuation
-key constructs
    "." the period will match any character; it does not have to be a letter
    "+" when appended to character or character class means one or more instances of previous character
    "^" if this is before a character class, it means you're matching the first character;
        however, if this is the first character inside a bracketed character class, it means negation/not
        for example: ^[a]. + or ^a.+ matches any consecutive sequence of 2 or more characters starting
        with the letter a, and ^[^a].+ matches any consecutive sequence of 2 or more characters not starting with a
    "$" When appended to a character or character class, it means 'ends with the previous character'
    for example, .+a$ will match a sequence of 2 or more characters ending in a

Coding with RegEx
When using regular expressions in your code, you need to remember that the \ character is an escape character.
This means that whenever \ is occurs in a string (or as part of a char), it's a sort of flag indicating you may
be trying to write a special instruction.

For example, when printing a string containing the newline character (\n);
the backslash tells the compiler that you're writing a special instruction,
and the n immediately following it indicates that your instruction is that it be a newline character.
If your intent is to have the literal backslash character in your string, then you must write it as \\.
When writing a RegEx string in code, you need your predefined character classes to be part of the string
so you must precede them with an additional backslash. For example, a string intended to be used as a regex
containing the \d character class must be written as "\\d".

For Java, the important classes to know are Pattern and Matcher.
A Pattern object is a compiled representation of a regular expression.
To create a Pattern object, you must invoke one of its static compile methods
(usually Pattern.compile(String regex)). You must then create a Matcher object
that matches your Pattern object (compiled RegEx) to the String you want to check.
To do this, you must invoke Pattern's matcher method on your Pattern object and
assign it to a variable of type Matcher. Once created, a Matcher object can be used to
perform matching operations.

// This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
String myRegExString = "[a-zA-Z\\s]+";

// This is the string we will check to see if our regex matches:
String myString = "The quick brown fox jumped over the lazy dog...";

// Create a Pattern object (compiled RegEx) and save it as 'p'
Pattern p = Pattern.compile(myRegExString);

// We need a Matcher to match our compiled RegEx to a String
Matcher m = p.matcher(myString);

// if our Matcher finds a match
if( m.find() ) {
    // Print the match
    System.out.println( m.group() );
}

The code above prints:

The quick brown fox jumped over the lazy dog

Notice that the ellipsis (...) at the end of the myString was not printed as part of the match;
that is because myRegExString only matches lowercase and uppercase English letters and spaces—not punctuation.
Thus, the ellipsis serves as a boundary for the end of our matched text.

For a string with more parts, you could do something like the following code which matches strings
of one or more sequential alphanumeric characters:

String s = "Hello, Goodbye, Farewell";
Pattern p = Pattern.compile("\\p{Alpha}+");
Matcher m = p.matcher(s);

while( m.find() ){
    System.out.println(m.group());
}

This loops through the string, finds each match, and prints it:

Hello
Goodbye
Farewell


STRING FUNCTIONS
Regular expressions can be pretty confusing, especially to new coders.
Fortunately, there are still some workarounds using simpler regular expressions
that you may find a little easier to use. If you know something about the structure
of the strings you'll be working with (i.e.: that they all follow the same format),
you can use a split method (e.g.: String.split(String regex) in Java). If you're
able to section/cut your input string into components, then you can choose the pieces
you want to use. For example, the code below splits two strings at a delimiter
(a comma followed by a space) and puts whatever falls between the delimiter into an array:

String s1 = "Hello, Goodbye, Farewell";
String s2 = "Hola, Adios, Hasta Luego";

String myDelimiter = ", ";

String[] s1array = s1.split(myDelimiter);
String[] s2array = s2.split(myDelimiter);

System.out.println("s1array[0]: " + s1array[0]);
System.out.println("s1array[1]: " + s1array[1]);
System.out.println("s1array[2]: " + s1array[2]);
System.out.println("s2array[0]: " + s2array[0]);
System.out.println("s2array[1]: " + s2array[1]);
System.out.println("s2array[2]: " + s2array[2]);

The above code prints:

s1array[0]: Hello
s1array[1]: Goodbye
s1array[2]: Farewell
s2array[0]: Hola
s2array[1]: Adios
s2array[2]: Hasta Luego

Note: This only really makes sense to do when you know that the input strings follow a uniform format.
You may also find the replaceAll method helpful when using this approach.

*/


















