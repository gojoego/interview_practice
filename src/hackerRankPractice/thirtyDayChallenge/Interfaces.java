package hackerRankPractice.thirtyDayChallenge;

/*



*/

public class Interfaces {
}

/*

INTERFACE
Recall that abstraction is the separation between what something does and how it's accomplished.
An interface is a collection of abstract methods and constants that form a common set of base
rules/specifications for those classes that implement it. Much like an abstract class, an interface
cannot be instantiated and must be implemented by a class.

Example
Consider a polygon. How do we interact with polygons? What properties are common among polygons?
Take some time to review the simple Polygon interface below, as well as the classes that implement it.

*/

/**
 *   This is a collection of methods we expect and require a polygon to have
 **/

interface Polygon{
    /** @return The number of sides of the Polygon **/
    int getNumberOfSides();
    /** @return The perimeter of the Polygon **/
    double getPerimeter();
}