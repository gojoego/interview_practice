package hackerRankPractice.thirtyDayChallenge.person;

/*

1. pointers

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
-

*/

// pro-tip: use * for importing ENUMs that are smaller

import static hackerRankPractice.thirtyDayChallenge.person.HairColor.*;

public class Persona {

    HairColor hairColor = BLACK;

    public static void main(String[] args) {

    }

}

/*



*/