package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class Generics {
}

/*

GENERICS
-generic constructs are a very efficient way of reusing your code
-in the same way you have parameters for a function, generics parameterize
type and allow you to use and apply the same interface, class, or method
using different data types while still restricting operations to that data
type (meaning that you still get strong type checking at compile time).
-map and list interfaces are generics
    public interface List<E> extends Collection<E>
    public interface Map<K,V>
-letters enclosed between angle brackets (< and >) are type parameters and,
like many things in programming, there is a convention behind them (remember,
following conventions help us write clean, readable code!)
-letters below are commonly-used generic type parameters:

E - Element
K - Key
V - Value
N - Number
T - Type (e.g.: data type)
S,U,V, etc. These are second, third, and fourth types for when T is already in use.

-parameterized type is basically a class or interface name that is immediately
followed by a type parameter in angle brackets
-List and Map are both parameterized types, and their respective parameters
(E, K, and V) all follow the conventions shown above
-helps us make some assumptions about the type of objects these type parameters
are standing in for
-like we pass arguments to functions and methods, we need to specify data types
for our type parameters when we instantiate generic objects

    List<String> stringList = new LinkedList<String>();
    List<Integer> integerList = new ArrayList<Integer>();
    Map<String, String> stringToStringMap = new HashMap<String, String>();
    Map<String, Integer> stringToIntMap = new LinkedHashMap<String, Integer>();

-once a data type is specified and an object is created, the specified type replaces
every occurrence of the generic type parameter in the instantiated class
-compiler also performs strict type checking to ensure you haven't tried to do
anything not allowable for that data type (e.g.: trying to add an element to
integerList that isn't of type Integer).

*/