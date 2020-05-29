package hackerRankPractice.thirtyDayChallenge;
/*

Objective
Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure.

Task
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
You will then be given an unknown number of names to query your phone book for. For each name queried,
print the associated entry from your phone book on a new line in the form name=phoneNumber;
if an entry for name is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

Input Format

The first line contains an integer, n, denoting the number of entries in the phone book.
Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line.
The first value is a friend's name, and the second value is an 8-digit phone number.

After the n lines of phone book entries, there are an unknown number of lines of queries.
Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English alphabetic letters and are first names only.

Constraints     1 <= n <= 10^5
                1 <= queries <= 10^5

Output Format

On a new line for each query, print Not found if the name has no corresponding entry in the phone book;
otherwise, print the full name and phoneNumber in the format name=phoneNumber.

Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933

Explanation

We add the following n = 3 (Key,Value) pairs to our map so it looks like this:

phoneBook = {(sam,99912222),(tom,11122222),(harry,12299933)}

We then process each query and print key=value if the queried key is found in the map; otherwise, we print Not found.

Query 0: sam
Sam is one of the keys in our dictionary, so we print sam=99912222.

Query 1: edward
Edward is not one of the keys in our dictionary, so we print Not found.

Query 2: harry
Harry is one of the keys in our dictionary, so we print harry=12299933.

*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // declare and initialize a new HashMap called phoneBook
            // utilize the .put method to add pairs to the HashMap

            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // for each query, print name=phoneNumber
            if (phoneBook.containsKey(s)){
                String entry = phoneBook.get(s).toString();
                System.out.println(s + "=" + entry);
            }else{
                System.out.println("Not found");
            }

        }
        in.close();



        /*

        JAVA MAPS
        Map is an interface that provides a blueprint for data structures that take (key, value) pairs
        and map keys to their associated values (it's important to note that both the key and the value
        must be Objects and not primitives). The implementation is done by implementing classes such as
        HashMap or LinkedHashMap. Consider the following code:

        */
        // Declare a String to String map
        Map<String, String> myMap1;

        // Initialize it as a new String to String HashMap
        myMap1 = new HashMap<String, String>();

        // Change myMap1 to be a new (completely different) String to String LinkedHashMap instead
        myMap1 = new LinkedHashMap<String, String>();
        /*

        Here are a few Map methods you will find helpful for this challenge:

        containsKey(Object key): Returns true if the map contains a mapping for key;
            returns false if there is no such mapping.
        get(Object key): Returns the value to which the key is mapped;
            returns null if there is no such mapping.
        put(K key, V value): Adds the (Key, Value) mapping to the Map;
            if the key is already in the map, the value is overwritten.

        */

        // Create a Map of String Keys to String Values, implemented by the HashMap class
        Map<String, String> myMap2 = new HashMap<String, String>();

        // Adds ("Hi","Bye") mapping to myMap2
        myMap2.put("Hi", "Bye");

        // Print the Value mapped to from "Hi"
        System.out.println(myMap2.get("Hi"));

        // Replaces "Bye" mapping from "Hi" with "Bye!"
        myMap2.put("Hi", "Bye!");

        // Print the Value mapped to from "Hi"
        System.out.println(myMap2.get("Hi"));

        /*

        produces the following output:

        Bye
        Bye!

        It is not necessary to declare myMap as type Map;
        you can certainly declare it as a HashMap (the instantiated type).

        */
    }
}