package hackerRankPractice.thirtyDayChallenge;

/*

dictionaries are containers like arrays

array - fixed length

dictionary
-key/value pairs
-has the ability to:
    1. insert
    2. find
    3. delete
-no restraints on size

NOTE: order won't necessarily correspond to order input
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();

        // putting things in our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        // retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));

        // print out all keys
        System.out.println(englSpanDictionary.keySet());

        // print out all value
        System.out.println(englSpanDictionary.values());

        // print out size of dictionary
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // shopping list
        // Map class is an interface - HashMap is a type of Ma p
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // boolean needs to be capitalize to make it an object
        // put some stuff in dictionary
        shoppingList.put("ham", Boolean.TRUE);
        shoppingList.put("bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("eggs", Boolean.FALSE);
        shoppingList.put("sugar", Boolean.FALSE);

        // retrieve items
        System.out.println(shoppingList.get("ham"));
        System.out.println(shoppingList.get("Oreos"));

        // key-value pairs print out
        System.out.println(shoppingList.toString());

        // is empty?
        System.out.println(shoppingList.isEmpty());

        // remove things
        shoppingList.remove("eggs");

        // replace values for a certain key
        shoppingList.remove("bread", Boolean.FALSE);

        // key-value pairs print out
        System.out.println(shoppingList.toString());

        // clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());

        // is empty?
        System.out.println(shoppingList.isEmpty());


    }
}

















































