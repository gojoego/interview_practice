package hackerRankPractice.thirtyDayChallenge.hotChocolate;

/*

what if a method does not handle an exception?

method must declare it using "throws" keyword

if exception might arise...
1. use try-catch block
2. use keyword "throws" in method signature
    -states that we will handle error higher up in the program

we can also throw errors!
- we can throw error inside of method using "throw" when
  we know something is wrong with the program (even if Java
  does not know something is wrong)

for example: programming a game
rule 1: score should never be negative
rule 2: there should be no way to lose points
if we break rule, throw exception
stop invalid games via exceptions

java's exceptions only arise if there are...
1. syntax errors
2. logic errors/bad access errors

but what if something else is wrong?

back to example:
1. create park via code
2. always want # of trees > 0
3. if this isn't the case, we want to know that as the program

we can do something about the errors
1. change invalid value in program to value that is valid
2. plant more trees if number of trees below valid value

* many errors in Java but we can also create our own types of exceptions

*/

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
        // throws = says when method called there is try catch at method above
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        double currentCocoaTemp = 170;
//        double currentCocoaTemp = 100;
//        double currentCocoaTemp = 200;
//        double currentCocoaTemp = 150;
        double currentCocoaTemp = 170;

        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("That's too hot!");
                currentCocoaTemp = currentCocoaTemp - 5;
            } catch (TooColdException e2) {
                System.out.println("That's so cold! It's like the arctic.");
                currentCocoaTemp = currentCocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone.");
    }
}
