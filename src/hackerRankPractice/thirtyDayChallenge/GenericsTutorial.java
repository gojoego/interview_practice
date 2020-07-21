package hackerRankPractice.thirtyDayChallenge;

/*

REMEMBER: Java is a strongly typed language.

Generics
-allow you to generalize what you put in your data structures (your containers of data)
-some data structures:
    linked lists- only one thing programmed to a certain type
-but we still want a consistent data type throughout the container
-allow a type or a method to operate on objects of various types while providing
compile time type safety

*/

import com.sun.tools.javah.Gen;

public class GenericsTutorial {

    public static void main(String[] args) {
        System.out.println(findMax(2,3));
        System.out.println(findMax(3,3));
        System.out.println(findMax(3,2));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));

//        GenericsTutorial k = new GenericsTutorial();
//        System.out.println(findMax(k, k));
    }

    public static <T extends Comparable <T>> T findMax(T a, T b){
        int n = a.compareTo(b); // -1 if a less than b, 0 if a = b, if a more than b 1
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}

/*

generics
    multiple datatypes/instances can use the same method

generic methods
    <D> D name (D param)

assume specific functionality
    <D> extends Comparable<D>

generic classes
    LinkedList<D>
    Queue<D>
    Stack<D>

*/