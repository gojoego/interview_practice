package hackerRankPractice.thirtyDayChallenge.person;

/*

1. pointers "address"
2. enums "pre-set values"
3. aliases
4. JVM
5. garbage collection
6. documentation

Pointers
-variables that store address of another variable in memory
-point to memory locations
-in order to get actual value in memory -> de-referencing a pointer
-all done for us in Java
-"address" of variable
-example: if you have a reference data structure like an array...
    -the array will have a pointer that holds the address of where
    that array is stored in memory
    -but will not have the entire array stored there
    -easier to FETCH data
    -takes less space and less time to iterate

difference between referenced and primitive data types...
    -referenced data type (class, dictionary, queue, linked list,
    stack or any other data structure) has pointer to memory
    location
        -ex: if we have a stack, we'll have an address and can fetch
        once we want to access data
    -primitive data type (int, boolean, character, etc) don't have
    pointers, no address that says where they are in memory

ENUM
-special data type that allows for variable to be one of a set of pre-defined constants

Aliases
-

*/

// pro-tip: use * for importing ENUMs that are smaller

import static hackerRankPractice.thirtyDayChallenge.person.HairColor.*;

public class Persona {

    // ALL CAPS for constants - used for variables that will not change
    HairColor hairColor = BLACK;

    public Persona(){
        int a = 5;
    }

    public static void main(String[] args) {
        Persona peterParker = new Persona();
        Persona spiderMan = peterParker;
        // point to same object in memory

        spiderMan.hairColor = PINK;

        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spider Man: " + spiderMan.hairColor);
    }
}

/*

Java garbage collection
-de-allocates memory and reuses space for something else
-helps us not run out of memory
-when objects can no longer be accessed, they are removed by the
garbage collector
-part of java virtual machine

JVM
-abstract computing machine that allows a computer to run Java programs

    1.  specification
        -what is required to run program?
    2.  implementation
        -programs that meets these specifications
    3.  instance
        -an implementation in action (exe)
        -running on system or computer
        -program being compiled into java byte code
        -built in compiler in the JVM

documentation -> the reason we don't really need to know anything
    -we need to know how to look up things



*/