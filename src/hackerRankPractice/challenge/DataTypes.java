package hackerRankPractice.challenge;

public class DataTypes {
}


/*

DATA TYPES

Data types define and restrict what type values can be stored in a variable, as well as set the rules
for what types of operations can be performed on it.

PRIMITIVE DATA TYPES

Java has 8 primitive data types: byte, short, int, long, float, double, boolean, and char.
For most challenges, you'll only need to concern yourselves with ints (e.g.: 1, 2, 3, etc.) and
doubles (e.g.: 1.0, 2.5, 3.9, etc.). Another important data type we mentioned yesterday is the
String class, whose objects are immutable strings of characters.

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

The breakdown below shows how a certain sequence of calls to a Scanner object, scan, will read the above input:


*/













